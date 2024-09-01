package basics;
import java.util.Scanner;
public class Strings_4 {
	public static void main(String[] args) {
    int num = 252;
    String st = String.valueOf(num);
    StringBuffer sb = new StringBuffer(st);
    sb.reverse();
    String st2 = sb.toString();
    System.out.println((st.equals(st2))? "Palindrome" :"Not a Palindrome");
	}

}
