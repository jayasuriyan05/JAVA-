package basics;
import java.util.Scanner;
public class Fish_bus {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number :");
	int div = sc.nextInt();
	if(div%5==0&&div%3==0)
	{
		System.out.println("FishBus");
	}
	else if(div%3 == 0)
	{
		System.out.println("Fish");
	}
	else if(div%5 == 0)
	{
		System.out.println("Bus");
	}
	else
	{
		System.out.println("INVALID");
	}
}
}
