package datastructures;
import java.util.*;
public class finddigit {
public static void main(String[] args) {
	int n=106108048;
	int original=n;
	int count=0;
	int rem=0;
	while(n!=0) {
		int digit=n%10;
		if(digit!=0&&original%digit==0) {
			count++;
		}
		n/=10;
	}
	System.out.println(count);
}
}
