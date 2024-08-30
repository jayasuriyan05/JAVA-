package basics;
import java.util.Scanner;
public class OneArray_8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = { 3, 4, 1, 7, 5 }; 
	int num = sc.nextInt();
		int i,flag=0;
	for (i=0;i<arr.length-2; i--) 
	{ 
		if (arr[i] == num) {
		  flag = 1;
		  break;
	} 
	}
		if(flag==1)
		{
		System.out.println(i);
 
}
		else
		{
			System.out.println(-1);
		}
}
}
