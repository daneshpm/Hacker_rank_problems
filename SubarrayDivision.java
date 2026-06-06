package datastructures;
import java.util.*;
public class SubarrayDivision {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<Integer> s= Arrays.asList(2,2,1,3,2);
	int d=4;
	int m=2;
	int res=0;
	int count=0;
		for(int i=0;i<m;i++) {
			 res+=s.get(i);
		}
		if(res==d) {
			count++;
		}
		 for (int i = m; i < s.size(); i++) {
		        res += s.get(i);
		        res-= s.get(i - m);

		        if (res == d) {
		            count++;
		        }
		    }
		System.out.print(count);
	
}
}
