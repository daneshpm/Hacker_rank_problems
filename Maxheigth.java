package datastructures;
import java.util.*;
public class Maxheigth {
public static void main(String[] args) {
	List<Integer> heights= Arrays.asList(1,6,3,5,2);
	int k=4;
	int maxheight=0;
	for(int heigth:heights) {
		maxheight=Math.max(maxheight,heigth);
	}
	if(maxheight>k) {
		System.out.println(maxheight-k);
	}else {
		System.out.println(0);
	}
}
}
