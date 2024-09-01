package basics;
import java.util.Scanner;
public class Strings_2 {
public static void main(String[] args) {
	String st = "Jaya Suriyan";
	System.out.println(st);
	String st1=" ";
	for(int i=0; i<st.length(); i++)
	{
		 char ch1 = st.charAt(i);
		 if(ch1<='Z' && ch1>='A')
		 {
			 ch1+=32;
		 }
		 else if(ch1<='z' && ch1>='a')
		 {
			 ch1-=32;
		 }
		 st1 = st1+ch1;
	}
		 System.out.println(st1);
}
}
