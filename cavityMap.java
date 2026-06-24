package datastructures;
import java.util.*;
public class cavityMap {
public static void main(String[] args) {
	List<String> grid = Arrays.asList("1112","1112", "1912", "1892", "1234");
	List<String> ans= new ArrayList<String>();
	int n=grid.size();
	char[][] result=new char[n][];
	for(int i=0;i<n;i++) {
		result[i]=grid.get(i).toCharArray();
	}
	for(int i=1;i<n-1;i++) {
		for(int j=1;j<n-1;j++) {
			char current=grid.get(i).charAt(j);
			if(current>grid.get(i-1).charAt(j) &&
				current>grid.get(i+1).charAt(j)&&
				current>grid.get(i).charAt(j-1)&&
				current>grid.get(i).charAt(j+1)) {
				result[i][j]='X';
			}
		}
	}
	for(char[] row:result) {
		ans.add(new String(row));
	}
	System.out.println(ans);
}
}
