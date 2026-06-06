package datastructures;
import java.util.*;
public class Grade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> grades= new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		grades.add(i,sc.nextInt());
	}
	List<Integer> result=new ArrayList<Integer>();
	for(Integer grade:grades) {
		if(grade<38) {
			result.add(grade);
		}
		else {
		  int nextMultiple=((grade/5)+1)*5;
		  if(nextMultiple-grade<3) {
			  result.add(nextMultiple);
		  }else {
			  result.add(grade);
		  }
		}
	}
System.out.println(result);
}
}
