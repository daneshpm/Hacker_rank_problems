package datastructures;
import java.util.*;
public class beautifuldays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	int k=sc.nextInt();
	int count=0;
	for(int x=i;x<=j;x++) {
		if((x-reverse(x))%k==0) {
			count++;
		}
	}
	System.out.println(count);
}
public static int reverse(int num) {
	int reversed=0;
	while(num!=0) {
		int digit=num%10;
		reversed=reversed*10+digit;
		num/=10;
	}
	return reversed;
}
}
