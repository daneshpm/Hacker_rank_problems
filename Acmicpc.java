package datastructures;
import java.util.*;
public class Acmicpc {
public static void main(String[] args) {
  List<String> topics = Arrays.asList("10101","11100","11010","00101");
  int n=topics.size();
  int maxtopics=0;
  int teams=0;
  System.out.println(n);
  for(int i=0;i<n;i++) {
	  for(int j=i+1;j<n;j++) {
		  int count=0;
		  String a = topics.get(i);
		  String b = topics.get(j);
		  for(int k=0;k<a.length();k++) {
			  if(a.charAt(k)=='1'||b.charAt(k)=='1') {
				  count++;
			  }
		  }
		  if(count>maxtopics) {
			  maxtopics=count;
			  teams=1;
		  }
		  else if(maxtopics==count) {
			  teams++;
		  }
	  }
  }
  System.out.println(maxtopics+" "+teams);
}
}
