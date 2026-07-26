package datastructures;
import java.util.*;
public class SuffleTwoString {
public static void main(String[] args) {
    String a ="a";
    String b="a";
    String c="aa";
    int n=a.length();
    int m=b.length();
    if(n+m!=c.length()) {
    	System.out.println("False");
    }
    boolean d[][] = new boolean[n+1][m+1];
    d[0][0]=true;
    for(int i=0;i<=n;i++) {
    	for(int j=0;j<=m;j++) {
    		if(i>0&&a.charAt(i-1)==c.charAt(i+j-1)) {
    			d[i][j] |= d[i-1][j];
    		}
    		if(j>0&&b.charAt(j-1)==c.charAt(i+j-1)) {
    			d[i][j] |= d[i][j-1];
    		}
    	}
    }
    System.out.println(d[n][m]);
}
}
