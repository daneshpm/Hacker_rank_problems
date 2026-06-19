package datastructures;
import java.util.*;
public class beautifulTriplets {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(1, 2, 4, 5, 7, 8, 10);
	int d=3;
	int count=0;
//	for(int i=0;i<arr.size();i++) {
//		for(int j=i+1;j<arr.size();j++) {
//			for(int k=j+1;k<arr.size();k++) {
//				if(arr.get(j)-arr.get(i)==d&&arr.get(k)-arr.get(j)==d) {
//					count++;
//				}
//			}
//		}
//	}
//	System.out.println(count);
Set<Integer> s =new HashSet<Integer>(arr);
for(int num:arr) {
	if(s.contains(num+d)&&s.contains(num+2*d)) {
		count++;
	}
}
System.out.println(count);
}
}
