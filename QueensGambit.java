package datastructures;
import java.util.*;
public class QueensGambit {
public static void main(String[] args) {
	List<List<Integer>> obstacles=Arrays.asList(Arrays.asList(5,5),Arrays.asList(4,2),Arrays.asList(2,3));
	int n=5;
	int k=3;
	int row=4;
	int col=3;
	
	int up=n-row;
	int down=row-1;
	int right=n-col;
	int left=col-1;
	
	System.out.println(up+" "+down+" "+right+" "+left);
	
	int upright=Math.min(up,right);
	int upleft=Math.min(left, up);
	int downleft=Math.min(left,down);
	int downright=Math.min(right, down);
	
	System.out.println(upright+" "+upleft+" "+downleft+" "+downright);
	for(List<Integer> obs: obstacles) {
		int r=obs.get(0);
		int c=obs.get(1);
		if(c==col) {
			if(r>row) {
				up=Math.min(up,r-row-1);
			}else {
				down=Math.min(down,row-r-1);
			}
		}
		else if(r==row) {
			if(c>col) {
				right=Math.min(right,c-col-1);
			}else {
				left=Math.min(left,col-c-1);
			}
		}
		else if(Math.abs(r-row)==Math.abs(c-col)) {
			if(r>row&&c>col) {
				upright=Math.min(upright,r-row-1);
			}
			else if(r>row&&c<col) {
				upleft=Math.min(upleft,r-row-1);
			}
			else if(r<row&&c>col) {
				downright=Math.min(downright, row-r-1);
			}
			else if(r<row&&c<col) {
				downleft=Math.min(downleft, row-r-1);
			}
		}
		
	}
	System.out.println(up+down+right+left+upright+upleft+downright+downleft);
}
}
