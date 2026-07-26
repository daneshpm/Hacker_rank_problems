package datastructures;
import java.util.*;
public class FindMsb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
//	int r=n/2;
//	int m=0;
//	int ans=0;
//	for(int i=0;i<=r;i++) {
//	    m =(int) Math.pow(2, i);
//	    if(m<=n) {
//	    	ans=Math.max(ans, m);
//	    }
//	}
//	System.out.println(ans);
	int msb= Integer.highestOneBit(n);
	System.out.println(msb);
}
}
