package datastructures;
import java.util.*;
public class stones {
public static void main(String[] args) {
	Set<Integer> s= new TreeSet<Integer>();
	int n=3;
	int a=3;
	int b=3;
   for(int i=0;i<n-1;i++) {
	    int sum=(n-1-i)*a+i*b;
	    s.add(sum);
   }
	s.add((n-1)*b);
	System.out.println( new ArrayList<>(s));
}
}
