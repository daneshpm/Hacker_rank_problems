package datastructures;
import java.util.*;
public class utopiantree {
public static void main(String[] args) {
	int n=5;
	int heigth=1;
	int period=1;
	for(int i=1;i<=n;i++) {
		if(i%2==1) {
			heigth*=2;
		}
		if(i%2==0) {
			heigth++;
		}
}
	System.out.println(heigth);
	
}
}
