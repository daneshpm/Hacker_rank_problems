package datastructures;
import java.math.BigInteger;
import java.util.*;
public class Strrr {
public static void main(String[] args) {
//	String s="I'm dead for real";
////	String[] str=s.split(" ");
//	StringBuilder str = new StringBuilder(s);
//	str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
//	
//    for(int i=0;i<s.length();i++) {
//        if(str.charAt(i)==' ') {
//        	str.setCharAt(i+1,Character.toUpperCase(str.charAt(i+1)));
//        }
//    }
//    System.out.println(str.toString());
    String n="5555555555555555555";
//    int num1=Integer.valueOf(n);
    String m="10637872774639692";
//    int num2=Integer.valueOf(m);
//    
//    String res=String.valueOf(num1+num2);
//    System.out.println(n+m);
    System.out.println(new BigInteger(n).add(new BigInteger(m)).toString());
    
    
}
}
