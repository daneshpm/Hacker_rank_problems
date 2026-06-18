package datastructures;
import java.util.*;
public class BiggerIsGreater {
public static void main(String[] args) {
	String s= "dhck";
	char[] arr = s.toCharArray();

    int i = arr.length - 2;

    // Find pivot
    while (i >= 0 && arr[i] >= arr[i + 1]) {
        i--;
    }

    if (i < 0) System.out.println("no answer");

    // Find smallest larger character
    int j = arr.length - 1;
    while (arr[j] <= arr[i]) {
        j--;
    }

    // Swap
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    // Reverse suffix
    int left = i + 1;
    int right = arr.length - 1;

    while (left < right) {
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    System.out.println(arr);
}
}
