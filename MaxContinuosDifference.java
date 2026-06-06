package datastructures;
import java.util.*;
public class MaxContinuosDifference {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(4,5,6,3,3,1);
	int[] freq=new int[101];
	for(int i:a) {
		freq[i]++;
	}
	int maxlength=0;
	for(int i=0;i<a.size();i++) {
	maxlength=Math.max(maxlength, freq[i]+freq[i+1]);
	}
	System.out.print(maxlength);
}
}
