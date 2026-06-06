package datastructures;
import java.util.*;
public class migratebirds {
public static void main(String[] args) {
List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
Map<Integer,Integer> m= new HashMap<Integer,Integer>();
for(int birds:arr) {
	m.put(birds,m.getOrDefault(birds,0)+1);
}
int maxfreq=0;
int result=Integer.MAX_VALUE;
for(Map.Entry<Integer,Integer> map :m.entrySet()) {
	int birdId=map.getKey();
	int freq=map.getValue();
	if(freq>maxfreq) {
		maxfreq=freq;
		result=birdId;
	}else if(freq==maxfreq&&birdId<result) {
		result=birdId;
	}
	
}
System.out.print(result	);
}
}
