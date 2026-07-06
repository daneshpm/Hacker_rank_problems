package datastructures;
import java.util.*;
public class Bomber {
public static void main(String[] args) {
	List<String> s = Arrays.asList(".......",".......","...0...",".......");
//	int n=s.size();
	int m=s.get(0).length();
	char[][] newgrid= new char[s.size()][m];
	for(int i=0;i<s.size();i++) {
		Arrays.fill(newgrid[i],'0');
	}
	for(int i=0;i<s.size();i++) {
		for(int j=0;j<s.get(0).length();j++) {
//			int up=(i==0)?0:s.get(i-1).charAt(j);
//			int down=(i==n-1)?0:s.get(i+1).charAt(j);
//			int left=(j==0)?0:s.get(i).charAt(j-1);
//			int right=(j==m-1)?0:s.get(i).charAt(j+1);
			if(s.get(i).charAt(j)=='0') {
				if(i>0) {
					newgrid[i-1][j]='.';
				}
				if(j>0) {
					newgrid[i][j-1]='.';
				}
				if(i<s.size()-1) {
					newgrid[i+1][j]='.';
				}
				if(j<m-1) {
					newgrid[i][j+1]='.';
				}
				newgrid[i][j]='.';
			}
		}
		
	}
	List<String> ans = new ArrayList<>();

	for (char[] row : newgrid) {
	    ans.add(new String(row));
	}
	System.out.println(ans);
}
}
