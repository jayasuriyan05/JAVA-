package basics;
import java.util.Scanner;
public class Wipro_Greatestdigitsplace {
	    public static void main(String[] args) {
	    int n1 = 2586;
	    int n2 = 3654;
	    int n3 = 4856;
	    int max;
	    int res = 0;
	    int out = 0;
	    while(n1>0)
	    {
	    	int a = n1%10;
	    	int b = n2%10;
	    	int c = n3%10;
	    	n1/=10;
	    	n2/=10;
	    	n3/=10;
	    	if(a>=b && a>=c) {
	    		max = a;
	    	}
	    	else if(b>=a && b>=c) {
	    		max = b;
	    	}
	    	else
	    	{
	    		max = c;
	    	}
	    	res = res*10+max;
	    }
	    	while(res>0)
	    	{
	    		out = out*10+(res%10);
	    		res = res/10;
	    	}
	    	System.out.println(out);
	    }
	    }
	



