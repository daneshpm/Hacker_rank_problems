package datastructures;
import java.util.*;
public class BreakingTheRecord {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> scores=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		scores.add(i,sc.nextInt());
	}
	int min=scores.get(0);
	int max=scores.get(0);
	int maxbreak=0;
	int minbreak=0;
	for(int score:scores) {
		if(score<min) {
			min=score;
			minbreak++;
		}
		if(score>max) {
			max=score;
			maxbreak++;
		}
	}
	System.out.println(Arrays.asList(maxbreak,minbreak));
}
}
