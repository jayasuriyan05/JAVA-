package basics;
import java.util.Scanner;
public class Array_Loop3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n = sc.nextInt();
	int [] arr = new int[n];
	System.out.println("Enter the elements :");
	for(int i=0; i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Array elements:");
	for(int i=0; i<arr.length;i++)
	{
		System.out.println("Element" +i+ "is" +arr[i]);
	}
}
}
