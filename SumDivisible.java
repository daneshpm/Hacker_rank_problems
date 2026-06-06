package datastructures;
import java.util.*;
public class SumDivisible {
public static void main(String[] args) {
	List<Integer> arr=Arrays.asList(1,3,2,6,1,2);
	int k=3;
	int count=0;
	for(int i=0;i<arr.size();i++) {
		int first=arr.get(i);
		for(int j=i+1;j<arr.size();j++) {
			int second=arr.get(j);
			int sum=first+second;
			if(sum%k==0) {
				count++;
			}
		}
	}
	System.out.print(count);
}
}
