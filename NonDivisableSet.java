package datastructures;
import java.util.*;
public class NonDivisableSet {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(278 ,576 ,496 ,727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436);
	int k=7;
//	*************************mistakeeeeeeee***************************
//	Set<Integer> r = new HashSet<Integer>();
//	for(int i=0;i<arr.size();i++) {
//		for(int j=i+1;j<arr.size();j++) {
//			int sum = arr.get(i)+arr.get(j);
//			if(sum%k!=0) {
//				r.add(arr.get(i));
//				r.add(arr.get(j));
//			}
//		}
//	}
//	System.out.println(r.size());
//	********************************************************************
	int[] freq=new int[arr.size()];
	for(int nums:arr) {
		freq[nums%k]++;
	}
//	for(int i:freq) {
//		System.out.println(i);
//	}
	int rem = Math.min(freq[0],1);
	for(int i=1;i<=k/2;i++) {
		if(i==k-i) {
			rem+=Math.min(freq[i],1);
		}
		else {
			rem+=Math.max(freq[i],freq[k-i]);
		}
	}
	System.out.println(rem);
}
}
//278,496,727,410,124,209,718,771,575,