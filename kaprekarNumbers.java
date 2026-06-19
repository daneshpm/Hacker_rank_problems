package datastructures;
import java.util.*;
public class kaprekarNumbers {
public static void main(String[] args) {
	int p=1;
	int q=100;
	boolean found=false;
	for(long n=p;n<=q;n++) {
		long square=n*n;
//		System.out.println(square);
		long digit=String.valueOf(n).length();
//		System.out.println(digit);
		long power=(long)Math.pow(10, digit);
//		System.out.println(power);
		long right = square%power;
//		System.out.println(right);
		long left=square/power;
//		System.out.println(left);
		if(right+left==n) {
			System.out.println(n+" ");
			found=true;
		}
	}
	if(!found) {
		System.out.println("Invalid");
	}
}
}
