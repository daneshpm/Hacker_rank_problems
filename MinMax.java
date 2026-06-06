package datastructures;
import java.util.*;
public class MinMax {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	List<Integer> arr = new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		arr.add(i,sc.nextInt());
	}
	Collections.sort(arr);
	long min=0;
	long max=0;
	for(int i=0;i<n-1;i++) {
		min+=arr.get(i);
		max+=arr.get(arr.size()-1-i);
	}
	System.out.println(min+" "+max);
}
}
