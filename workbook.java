package datastructures;
import java.util.*;
public class workbook {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(4, 2, 6, 1, 10);
	int k=3;
	int page=1;
	int special=0;
	for(int problems:arr) {
		for(int start=1;start<=problems;start+=k) {
			int end=Math.min(start+k-1,problems);
			if(page>=start&&page<=end) {
				special++;
			}
			page++;
		}
	}
	System.out.println(special);
}
}
