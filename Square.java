package datastructures;
import java.util.*;
public class Square {
public static void main(String[] args) {
  int a =24;
  int b=49;
//  double b=Math.sqrt(a);
//  int count=0;
//  if(a%b==0) {
//	  count++;
//  }
 
  int start=(int) Math.ceil(Math.sqrt(a));
  int end=(int) Math.floor(Math.sqrt(b));
  System.out.println(end-start+1);
}
}
