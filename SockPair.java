package datastructures;
import java.util.*;
public class SockPair {
public static void main(String[] args) {
List<Integer> ar=Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3,3);
Map<Integer,Integer> m = new HashMap<Integer,Integer>();
for(int arr:ar) {
	m.put(arr,m.getOrDefault(arr,0)+1);
}
System.out.print(m);
int paircount=0;
for(Map.Entry<Integer,Integer> map:m.entrySet()) {
	int sockvalue=map.getValue();
	if(sockvalue>=2) {
		if(sockvalue%2==0||sockvalue%2==1) {
			int multi=sockvalue/2;
			paircount+=multi;
		}
	}
}
System.out.print(paircount);
}
}
