package datastructures;

import java.util.*;

public class Birthdaycandles {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> candles=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		candles.add(i,sc.nextInt());
	}
	int max=Collections.max(candles);
	int count=0;
	for(Integer candle:candles) {
		if(max==candle) {
			count++;
		}
	}
	System.out.println(count);
}
}
