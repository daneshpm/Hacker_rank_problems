package datastructures;
import java.util.*;

public class chocolateFeast {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); 
	int c=sc.nextInt();
	int m=sc.nextInt();
	int chocolates = n / c;
    int wrappers = chocolates;

    while (wrappers >= m) {

        int newChocolates = wrappers / m;

        chocolates += newChocolates;

        wrappers = wrappers % m + newChocolates;
    }

    System.out.println(chocolates);
}
}

