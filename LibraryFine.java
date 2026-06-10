package datastructures;
import java.util.*;
public class LibraryFine {
public static void main(String[] args) {
	int d1=16;
	int m1=6;
	int y1=2015;
	int d2=9;
	int m2=6;
	int y2=2016;
	if(y1!=y2&&y2<y1) {
		System.out.println(10000);
	}
	else if(y1==y2&&m2<m1) {
		System.out.println(500*(m1-m2));
	}
	else if(y1==y2&&m1==m2&&d1>d2) {
	    System.out.println(15*Math.abs(d1-d2));
	}
	else {
		System.out.println(0);
	}
}
}
