package datastructures;
import java.util.*;
public class SurfaceArea {
public static void main(String[] args) {
	List<List<Integer>> A =Arrays.asList(Arrays.asList(1,3,4),Arrays.asList(2,2,3),Arrays.asList(1,2,4));
    int area=0;
    int n=A.size();
    int m= A.get(0).size();
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		int h=A.get(i).get(j);
    		if(h>0) {
    			area+=2;
    		}
    		int up=(i==0)?0:A.get(i-1).get(j);
    		int down=(i==n-1)?0:A.get(i+1).get(j);
    		int left=(j==0)?0:A.get(i).get(j-1);
    		int right=(j==m-1)?0:A.get(i).get(j+1);
    		area+=Math.max(0,h-up);
    		area+=Math.max(0,h-down);
    		area+=Math.max(0,h-left);
    		area+=Math.max(0,h-right);
    	}
    }
  System.out.println(area);
}
}
