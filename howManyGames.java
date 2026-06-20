package datastructures;
import java.util.*;
public class howManyGames {
public static void main(String[] args) {
	int p=100;
	int d=19; 
	int m=1; 
	int s=180;
	int result=0;
	int count=0;
	List<Integer> a = new ArrayList<Integer>();
	for(int i=p;i>=m;i-=d) {
	
		a.add(i);
	}
	for(int i=0;i<a.size();i++) {
		result+=a.get(i);
		if(result>s) {
			System.out.println(i);
			break;
		}
	}
	System.out.println(result);
	if(result<s) {
		int v=s-result;
		count=a.size()+(v/m);
	
	}
	System.out.println(a);
	System.out.println(count);
//	System.out.println(p);
		
	
}
}
