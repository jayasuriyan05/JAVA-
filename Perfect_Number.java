package basics;
import java.util.Scanner;
public class Perfect_Number {
	public static void main(String[] args) {
		int i;
		int n=1;
		int s=1;
		Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    for(i = 2; i<=n/2;i++)
	    {
	    	if(n%i==0)
	    	{
	    		s = s+i;
	    	}
	    }
		if(s == n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}

}
