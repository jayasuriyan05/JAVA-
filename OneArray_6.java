package basics;
import java.util.Scanner;
public class OneArray_6 {
		static int search(int arr[], int n, int x) 
		{ 
			for (int i = 0; i < n; i++) { 
			if (arr[i] == x) 
					return i; 
			}
			return -1; 
		} 
		public static void main(String[] args) 
		{ 
			int[] arr = { 3, 4, 1, 7, 5 }; 
			int n = arr.length; 
			int x = 10; 
			int index = search(arr, n, x); 
			if (index == -1) 
				System.out.println("-1"); 
			else
				System.out.println("Element found at position " + index); 
		} 
	} 

