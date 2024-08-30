package basics;
import java.util.Scanner;
public class OneArray_7 {
public static void main(String[] args) {
	java.util.Scanner sc = new Scanner(System.in);
	int[] arr = { 3, 4, 1, 7, 5 }; 
	int temp = arr[0];
	arr[0] = arr[1];
	arr[1] = temp;
	System.out.println(+arr[0] +arr[1]);
}
}

