package datastructures;
import java.util.*;
public class minimumDistances {
public static void main(String[] args) {
	List<Integer> a = Arrays.asList(7, 1, 3, 4, 1, 7);
////	for(int i=0;i<a.size();i++) {
////		for(int j=a.size()-1;j<=0;j--) {
////			if(a.get(i)==a.get(j)) {
////				System.out.println(j-i);
////			}
////		}
////	}
//	int i=0;
//	int j=a.size()-1;
////	boolean found=false;
//	int result=Integer.MAX_VALUE;
//	while(i<j) {
//		if(a.get(i)==a.get(j)) {
////			System.out.println(j-i);
//			result=Math.min(result,j-i);
////			found=true;
//		}
//			i++;
//			j--;
//	}
//	if(result==Integer.MAX_VALUE) {
//		System.out.println(-1);
//	}
//	System.out.println(result);
////	if(!found) {
////		System.out.println(-1);
////	}
Map<Integer,Integer> m = new HashMap<Integer, Integer>();
int result=Integer.MAX_VALUE;
for(int i=0;i<a.size();i++) {
	int num=a.get(i);
	if(m.containsKey(num)) {
		result=Math.min(result, i-m.get(num));
	}
	m.put(num,i);
}
System.out.println(result==Integer.MAX_VALUE?-1:result);
}
}
