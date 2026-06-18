package datastructures;
import java.util.*;
public class OrganizingContainers {
public static void main(String[] args) {
List<List<Integer>> containers = Arrays.asList(Arrays.asList(1,4),Arrays.asList(2,3));
int n = containers.size();
long[] containerSize =new long[n];
long[] typeCout=new long[n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		long value=containers.get(i).get(j);
		containerSize[i]+=value;
		typeCout[j]+=value;
	}
}
Arrays.sort(containerSize);
Arrays.sort(typeCout);
if(containerSize.equals(typeCout)) {
	System.out.println("possible");
}else {
	System.out.println("immposible");
}
}
}
