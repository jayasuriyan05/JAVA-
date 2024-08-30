package basics;
import java.util.Scanner;
public class Prime_number {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int num = 11;
	int flag = 0;
	for(int i = 2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag++;
		}
	}
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}

}
}
