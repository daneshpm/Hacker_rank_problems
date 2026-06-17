package datastructures;
import java.util.*;
public class cutstick {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(5,4,4,2,2,8);
	Collections.sort(arr);
	System.out.println(arr);
	List<Integer> result = new ArrayList<>();
	result.add(arr.size());
	for(int i=1;i<arr.size();i++) {
		if(!arr.get(i).equals(arr.get(i-1))) {
			result.add(arr.size()-i);
		}
	}
	System.out.println(result);
}
}
