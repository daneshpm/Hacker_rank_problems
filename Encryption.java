package datastructures;
import java.util.*;
public class Encryption {
public static void main(String[] args) {
	String s = "iffactsdontfittotheorychangethefacts";
	int n=s.length();
	StringBuilder v = new StringBuilder();
	double row=Math.floor(Math.sqrt(n));
	System.out.println(row);
	double col=Math.ceil(Math.sqrt(n));
	System.out.println(col);
    for(int i =0;i<=row;i++) {
    	for(int j=i;j<n;j+=col) {
        	char d =s.charAt(j);
//        	System.out.println(d);
        	v.append(d);
    	}
    	v.append(" ");
    }
    if(row==col) {
     System.out.println(v.substring(0,(int)((row*col)+row-1)));
    }else {
    	System.out.println(v);
}
}
}