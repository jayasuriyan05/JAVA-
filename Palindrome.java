package basics;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	int a = 567;
	int rev = 0;
	int store = a;
	while(store!=0)
	{
	    rev = rev*10+(store%10);
	    store = store/10;
	}
	if(rev == a)
	{
	    System.out.println("Palindrome");
	}
	else{
	     System.out.println("Not a Palindrome");
	}
	}  
	}
 
