package datastructures;
import java.util.*;
public class StrangeCounter {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 long t = sc.nextLong();
 long cycle=3;
 while(t>cycle) {
	 t-=cycle;
	 cycle*=2;
 }
 System.out.println(cycle-t+1);
}
}
