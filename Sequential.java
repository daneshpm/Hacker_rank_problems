package datastructures;
import java.util.*;
public class Sequential {
public static void main(String[] args) {
	List<Integer> p=Arrays.asList(5,2,1,3,4);
	Map<Integer,Integer> m = new HashMap<>();
	for(int i=0;i<p.size();i++) {
		m.put(p.get(i),i+1);
	}
	List<Integer> result= new ArrayList<>();
	for(int x=1;x<=p.size();x++) {
		int y=m.get(x);
		int s=m.get(y);
		result.add(s);
	}
	System.out.println(result);
}
}
