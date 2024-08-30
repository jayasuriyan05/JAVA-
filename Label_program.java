package basics;
import java.security.DomainCombiner;
import java.util.Scanner;
public class Label_program {
public static void main(String[] args) {
	A:
		for(int b=1;b<=5;b++)
		{
			for(int bl=1;bl<=5;bl++)
			{
				if(b==3)
				{
					continue A;
				}
				System.out.println("Basket : "+b+" Ball : "+bl);
							}
		}
}
}
