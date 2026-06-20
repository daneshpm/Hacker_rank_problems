package datastructures;
import java.util.*;
public class timeInWords {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int h=sc.nextInt();
	int m=sc.nextInt();
	String[] words = {
			"",
			"one","two","three","four","five",
			"six","seven","eight","nine","ten",
			"eleven","twelve","thirteen","fourteen",
			"quarter","sixteen","seventeen","eighteen",
			"nineteen","twenty","twenty one","twenty two",
			"twenty three","twenty four","twenty five",
			"twenty six","twenty seven","twenty eight",
			"twenty nine","half"
			};
	if (m == 0)
        System.out.println( words[h] + " o' clock");

    if (m <= 30) {

        if (m == 15 || m == 30)
        	System.out.println( words[m] + " past " + words[h]);

        if (m == 1)
        	System.out.println( "one minute past " + words[h]);

            System.out.println( words[m] + " minutes past " + words[h]);
    }

    int rem = 60 - m;

    if (rem == 15)
    	System.out.println( "quarter to " + words[h + 1]);

    if (rem == 1)
        System.out.println("one minute to " + words[h + 1]);

    System.out.println(words[rem] + " minutes to " + words[h + 1]);
}
}
