package datastructures;

import java.util.*;

public class designerPdf {
	public static void main(String[] args) {
		List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
		String word="abc";
		int i=0;
		Map<Character,Integer> mapper = new HashMap<Character,Integer>();
		for(char c='a';c<='z';c++) {
				mapper.put(c,h.get(i));
				i++;
		}
		System.out.println(mapper);
		int max=0;
		for(Map.Entry<Character,Integer> m:mapper.entrySet()) {
			char hid=m.getKey();
			int height=m.getValue();
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)==hid) {
					max=Math.max(max,height);
				}
			}
		}
		System.out.println(max);
		System.out.println(max*word.length());
	}
}
