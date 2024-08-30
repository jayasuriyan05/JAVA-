package basics;
import java.util.Scanner;
public class Even_1to100 {
public static void main(String[] args) {
	int s=1;
	int t=100;
	for(int i=s; i<=t; i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
