package datastructures;
import java.util.*;
public class serviceLane {
public static void main(String[] args) {
	List<Integer> width = Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3);
	List<List<Integer>> cases = Arrays.asList(Arrays.asList(0,3),Arrays.asList(4,6));
	List<Integer> result= new ArrayList<>();
	for(List<Integer> v:cases) {
		int start = v.get(0);
		int end=v.get(1);
		int min=Integer.MAX_VALUE;
		for(int i=start;i<=end;i++) {
			min=Math.min(min,width.get(i));
		}
		result.add(min);
	}
	System.out.println(result);
}
}
