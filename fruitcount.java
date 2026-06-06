package datastructures;
import java.util.*;
public class fruitcount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s=sc.nextInt();
	int t=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	int n=sc.nextInt();
	List<Integer> apples=new ArrayList<Integer>();
	List<Integer> oranges= new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		apples.add(i,sc.nextInt());
		oranges.add(i,sc.nextInt());//F**r write in other loop
	}
	int applecount=0;
	int orangecount=0;
	for(int apple:apples) {
		int position=a+apple;
		if(position>=s&&position<=t) {
			applecount++;
		}
	}
	for(int orange:oranges) {
		int place=b+orange;
		if(place>=s&&place<=t) {
			orangecount++;
		}
	}
	System.out.println(applecount+""+orangecount);
}
}
