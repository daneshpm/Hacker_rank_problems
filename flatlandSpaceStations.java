package datastructures;
import java.util.*;
public class flatlandSpaceStations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[] c = new int[m];
for(int i=0;i<m;i++) {
    c[i]=sc.nextInt();
}
//if(n==m) {
//    System.out.println(0);
//}
//int val=0;
//for(int i=0;i<n;i++) {
//   int val1=Integer.MAX_VALUE;
//    for(int j=0;j<m;j++) {
//        if(i==c[j]) {
//          val1=0;
//            break;
//        }
//       
//        int ans=Math.abs(c[j]-i);
//        val1=Math.min(ans,val1);
//        
//    }
//       val=Math.max(val,val1);
//}
//
//System.out.println(val);
Arrays.sort(c);
int maxdis=Math.max(c[0],n-1-c[m-1]);
for(int i=1;i<m;i++) {
	maxdis=Math.max(maxdis,(c[i]-c[i-1])/2);
}
System.out.println(maxdis);
}
}