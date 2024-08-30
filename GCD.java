package basics;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
	int a = 9;
	int b = 27;
	int g = 1;
	for(int i=1; i<=a && i<=b; i++)
	{
		if(a%i==0 && b%i==0)
			g = i;
	}
		System.out.println(g);
	}
}

