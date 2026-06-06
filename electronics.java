package datastructures;
import java.util.*;
public class electronics {
public static void main(String[] args) {
	int[] keyboards= {3,1};
	int[] drives= {5,2,8};
	int b=10;
	int max=-1;
	int sum=0;
    for(int i=0;i<keyboards.length;i++){
       int keyboard=keyboards[i];
       for(int j=0;j<drives.length;j++){
           int drive=drives[j];
            sum=keyboard+drive;
           if(sum<=b){
            max=Math.max(max,sum);
           }
       }
    }
System.out.print(max);
}
}

