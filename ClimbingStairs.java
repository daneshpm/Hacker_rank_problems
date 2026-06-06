package datastructures;
import java.util.*;
public class ClimbingStairs {
public static void main(String[] args) {
	List<Integer> ranked= Arrays.asList(100,90,90,80);
	List<Integer> players=Arrays.asList(70,80,105);
	List<Integer> unique= new ArrayList<Integer>();
	unique.add(ranked.get(0));
	for(int i=1;i<ranked.size();i++) {
		if(!ranked.get(i).equals(ranked.get(i-1))) {
		unique.add(ranked.get(i));
		}
	}
	List<Integer> result= new ArrayList<Integer>();
	int j=unique.size()-1;
	for(int scores:players) {
		while(j>=0&&scores>=unique.get(j)) {
			j--;
		}
		result.add(j+2);
	}
	System.out.print(result);
}
}
