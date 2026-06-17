package datastructures;
import java.util.*;
public class Equilaize {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(3,3,2,1,3);
	int max=0;
	Map<Integer,Integer> m = new HashMap<>();
	for(int i=0;i<arr.size();i++) {
		m.put(arr.get(i),m.getOrDefault(arr.get(i),0)+1);
	}
	for(int freq:m.values()) {
		max=Math.max(max,freq);
	}
	System.out.println(arr.size()-max);
}
}
