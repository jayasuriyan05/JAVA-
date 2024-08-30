package basics;
import java.util.Scanner;
public class TwoD_array {
public static void main(String[] args) {
	int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	for(int r=0; r<arr.length; r++)
	{
		for(int c=0;c<arr[r].length;c++)
		{
			System.out.println(arr[r][c]+ "  ");
		}
		System.out.println();
	}
	
}
}
