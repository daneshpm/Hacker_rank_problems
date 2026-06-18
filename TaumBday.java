package datastructures;
import java.util.*;
public class TaumBday {
public static void main(String[] args) {
int b=27984;
int w=1402;
int bc=619246;
int wc=615589;
int z= 247954;
if(bc>wc+z) {
	System.out.println((long)b*z+(long)wc*(b+w));
}
else if(wc>bc+z) {
	System.out.println((long)w*z+(long)bc*(b+w));
}
//else if(z>bc&&z>wc) {
else {
	System.out.println((long)w*wc+(long)b*bc);
}
}
}
