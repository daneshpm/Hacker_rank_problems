package datastructures;
import java.util.*;
public class fairRations {
public static void main(String[] args) {
	List<Integer> B=Arrays.asList(2,3,4,5,6);
	int count=0;
	for(int i=0;i<B.size()-1;i++) {   //if B.size() array out of bound
		if(B.get(i)%2!=0) {
			B.set(i,B.get(i)+1);
			B.set(i+1,B.get(i+1)+1);
			count+=2;
		}
	}
	if(B.get(B.size()-1)%2!=0) {
		System.out.println("NO");
	}
	System.out.println(String.valueOf(count));
}
}
