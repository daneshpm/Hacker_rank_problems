package datastructures;
import java.util.*;
public class valley {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String paths=sc.next();
	int valley=0;
	int level=0;
	for(int i=0;i<paths.length();i++) {
		char l=paths.charAt(i);
		if(l=='U') {
			level++;
			if(level==0) {
				valley++;
			}
		}else {
			level--;
		}
	}
	System.out.println(valley);
}
}
