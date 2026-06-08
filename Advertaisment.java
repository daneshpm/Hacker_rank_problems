package datastructures;
import java.util.*;
public class Advertaisment {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int shared=5;
int liked=0;
int cumumlative=0;
for(int i=1;i<=n;i++) {
	liked=shared/2;
	cumumlative+=liked;
	shared=liked*3;
}
System.out.println(cumumlative);
}
}
