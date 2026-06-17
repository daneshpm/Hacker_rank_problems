package datastructures;
import java.util.*;
public class RepeatedString {
public static void main(String[] args) {
 String s= "abaabaabaabaabaabaabaabaabaaba";
// substring to repeat
 long n=10;
 long countA=0;
 for(int i=0;i<=n;i++) {
	 if(s.charAt(i)=='a') {
		 countA++;
	 }
 }
 long d=n/s.length();
 long r=n%s.length();
 long result=d*countA;
 for(int i=0;i<r;i++) {
	 if(s.charAt(i)=='a') {
		 result++;
	 }
 }
 System.out.println(result);
}
}
