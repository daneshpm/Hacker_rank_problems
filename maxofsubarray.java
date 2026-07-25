package datastructures;
import java.util.*;
public class maxofsubarray {
public static void main(String[] args) {
	int[] arr = {3,2,3,5,2,7};
	int k=3;
	int n=arr.length;
	Deque<Integer> d = new ArrayDeque<Integer>();
	List<Integer> ans = new ArrayList<Integer>();
	
	for(int i=0;i<n;i++) {
		while(!d.isEmpty()&&d.peekFirst()<=i-k) {
			d.pollFirst();
		}
		while(!d.isEmpty()&&arr[d.peekLast()]<=arr[i]) {
			d.pollLast();
		}
		d.offerLast(i);
		
		if(i>=k-1) {
			ans.add(arr[d.peekFirst()]);
		}
	}
	System.out.println(ans);
	
}
}
