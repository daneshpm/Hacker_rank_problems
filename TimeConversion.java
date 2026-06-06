package datastructures;

import java.util.Scanner;

public class TimeConversion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	String period=s.substring(s.length()-2);
	String[] time=s.substring(0,8).split(":");
	int hour=Integer.parseInt(time[0]);
	if(period.equals("AM")&&hour==12) {
		hour=0;
	}
	if(period.equals("PM")&&hour!=12) {
		hour+=12;
	}
	String result=String.format("%02d:%s:%s",hour,time[1],time[2]);
	System.out.println(result);
}
}
