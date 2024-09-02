package basics;
import java.util.Scanner;
public class Fibonacci_Series {
String fib (int n) {
	int n1 = 0,n2 = 1;
	String res = n1+","+n2+",";
	int n3 = n1 + n2;
	for(int i=0; i<n-2; i++)
	{
		n3 = n1+n2;
		if(i == (n-3)) {
			res+=n3+".";
			return res;
			}
		res+= n3+",";
		n1 = n2;
		n2 = n3;
	}
	return res;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Fibonacci_Series p1 = new Fibonacci_Series();
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	String res = p1.fib(num);
	System.out.println(res);
}
}
