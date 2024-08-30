package basics;
import java.util.Scanner;
public class Nested_Loop {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int sum = 0;
	  while(num>9)
	  {
		  sum = 0;
		  while(num>0)
		  {
			  sum = sum+(num%10);
			  num/=10;
		  }
		  num = sum;
	  }
		  System.out.println(sum);
	  }
}
