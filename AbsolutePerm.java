package datastructures;
import java.util.*;
public class AbsolutePerm {
public static void main(String[] args) {
	int n =10;
	int k=1;
    int[] pos = new int[n+1];
//	for(int i=0;i<n;i++) {
//		pos[i]=i+1;
//	}
	List<Integer> ans = new ArrayList<>();
////	for(int i=0;i<=n;i++) {
////	System.out.println(pos[i]);
////	}
//	for(int i=1;i<=n;i++) {
//		for(int j=0;j<n;j++) {
//			if(Math.abs(pos[j]-i)==k) {
//				ans.add(pos[j]);
//			}
//		}
//	}
//	System.out.println(ans);
//	System.out.println(ans.size());
//	if(n==ans.size()) {
//	System.out.println(ans);
//	}else {
//		System.out.println(-1);
//	}
    boolean[] used = new boolean[n+1];
    for(int i=1;i<=n;i++) {
    	if(i-k>0&&!used[i-k]) {
    		ans.add(i-k);
    		used[i-k]=true;
    	}
    	else if(i+k<=n&&!used[i+k]) {
    		ans.add(i+k);
    		used[i+k]=true;
    	}else {
    		System.out.print(-1);
    	}
    }
    System.out.println(ans);
}
}
