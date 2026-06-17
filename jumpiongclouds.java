package datastructures;
import java.util.*;
public class jumpiongclouds {
	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(0,1,0,0,1,0,0);
		int i=0;
		int jumps=0;
		while(i<c.size()-1) {
			if(i+2<c.size()&&c.get(i+2)==0) {
				i+=2;
			}else {
				i++;
			}
			jumps++;
		}
		System.out.println(jumps);
	}
}
