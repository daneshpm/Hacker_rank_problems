package datastructures;
import java.util.*;
public class BillDivison {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> bill= new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		bill.add(i,sc.nextInt());
	}
	int skipper=sc.nextInt();
	int charged=sc.nextInt();
	int amount=0;
	for(int i=0;i<n;i++) {
		if(i!=skipper) {
			amount+=bill.get(i);
		}
	}
	int actual=amount/2;
	if(actual==charged) {
		System.out.println("Bon Apptite");
	}else {
		System.out.println(charged-actual);
	}
}
}
