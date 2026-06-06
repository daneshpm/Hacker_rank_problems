package datastructures;
import java.util.*;
public class BetweenToSet {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	List<Integer> a= new ArrayList<Integer>();
	List<Integer> b=new ArrayList<Integer>();
	for(int i=0;i<m;i++) {
		a.add(i,sc.nextInt());
	}
	for(int i=0;i<n;i++) {
		b.add(i,sc.nextInt());
	}
	int lcm=a.get(0);
	for(int x=1;x<a.size();x++) {
		lcm=lcm(lcm,a.get(x));
	}
	int gcd=b.get(0);
	for(int x=1;x<b.size();x++) {
		gcd=gcd(gcd,b.get(x));
	}
	System.out.println(lcm);
	System.out.print(gcd);
	int count=0;
	for(int multiple=lcm;multiple<gcd;multiple+=lcm) {
		if(gcd%multiple==0) {
			count++;
		}
	}
	System.out.println(count);
	
}
public static int lcm(int a,int b) {
	int ans=(a*b)/gcd(a,b);
	return ans;
}
public static int gcd(int a,int b) {
	while(b!=0) {
		int temp=b;
		b=a%b;
		a=temp;
	}
	return a;
}
}
