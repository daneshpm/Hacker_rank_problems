package datastructures;
import java.util.*;
public class gridSearch { 
	public static void main(String[] args) {
		List<String> g = Arrays.asList("2229505813","5633845374","6473530293");
		System.out.println(g);
		List<String> p=Arrays.asList("9505","3845","3530");
		int R=g.size();
		int r=p.size();
		int C=g.get(0).length();
		int c=p.get(0).length();
		
		for(int i=0;i<=R-r;i++) {
			for(int j=0;j<=C-c;j++) {
				boolean found=true;
				for(int k=0;k<r;k++) {
					String sub = g.get(i+k).substring(j,j+c);
					if(!sub.equals(p.get(k))) {
					     found=false;
					     break;
					}
				}
				if(found) {
					System.out.println("Yes");
				}
			}
		}
	}
}
//The algorithm works by checking the first matching value and then proceeding
