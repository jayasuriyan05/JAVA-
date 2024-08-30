package basics;
import java.util.Scanner;
public class Array_Loop2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[ ] arr = new int[10];
	System.out.println("Enter the array elements :");
	for(int i=0; i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("The Array Elements:");
	for(int i=0; i<arr.length;i++)
	{
		System.out.println("Element:"+i+ " is "+arr[i]);
	}
}
}

