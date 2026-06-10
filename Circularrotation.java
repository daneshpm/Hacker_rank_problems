package datastructures;
import java.util.*;
public class Circularrotation {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(3,4,5);
	List<Integer> queries=Arrays.asList(1,2);
	int k=2;
	List<Integer> result = new ArrayList<>();
	int n=a.size();
	for(int q:queries) {
		int originalIndex=(q-k%n+n)%n;
		result.add(a.get(originalIndex));
	}
	System.out.println(result);
}
}
