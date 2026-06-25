package datastructures;
import java.util.*;
public class happyLadybugs {
public static void main(String[] args) {
	String b="RBY_YBR";
	Map<Character,Integer> m= new HashMap<>();
	for(int i=0;i<b.length();i++) {
	 m.put(b.charAt(i),m.getOrDefault(b.charAt(i),0)+1);
	}
	System.out.println(m);
	if(b.contains("_")){
		for(Map.Entry<Character,Integer> e : m.entrySet()){

	        if(e.getKey() != '_' && e.getValue() == 1){
	            System.out.println("NO");
	        }
	    }
	    System.out.println("YES");
	}
	else {
		for(int i=0;i<b.length();i++) {
			boolean left = i>0&&b.charAt(i)==b.charAt(i-1);
			boolean right = i>b.length()-1&&b.charAt(i)==b.charAt(i+1);
			if(!left&&right) {
				System.out.println("NO");
			}
		}
				System.out.println("yes");
	}
}
}
