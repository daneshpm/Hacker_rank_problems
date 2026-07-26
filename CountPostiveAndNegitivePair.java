package datastructures;
import java.util.*;
public class CountPostiveAndNegitivePair {
public static void main(String[] args) {
	Map<Integer,Integer> m = new HashMap<>();
	int[] arr = {-2 ,8, 2, 5 ,-2 ,-5};
	int count=0;
	for(int i=0;i<arr.length;i++) {
	if(m.containsKey(-arr[i])) {
		count+=m.get(-arr[i]);
	}
	m.put(arr[i],m.getOrDefault(arr[i],0)+1);
	}
	System.out.println(count);
}
}
