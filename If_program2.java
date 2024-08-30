package basics;
import java.util.Scanner;
public class If_program2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int asc = sc.nextInt();
		if(asc>=65 && asc<=90)
		{
			System.out.println("Capital Alphabet Ascii value");
			System.out.println((char)asc);
		}
		else if(asc>=97 && asc<=122)
		{
			System.out.println("Small Alphabet Ascii Value");
			System.out.println((char)asc);
			
		}
		else if(asc>=48 && asc<=57)
		{
			System.out.println("Numerical Ascii Value");
			System.out.println((char)asc);
		}
		else if(asc == 32)
		{
			System.out.println("Space Ascii Value");
		}
		else 
		{
			System.out.println("Invalid Ascii value");
		}
			

	}

}
