package basics;
import java.util.Scanner;
public class Recursion_1 {
	String meth(char ch[], char[] ch1) {
		String s1 = new String(ch);
		String s2 = new String(ch1);
		String res = s1+s2;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Recursion_1 p1 = new Recursion_1();
		char[] ch = {'H','I',' '};
		char[] ch1 = {'E','V','E','R','Y','O','N','E'};
		String res = p1.meth(ch,ch1);
		String s1 = new String(ch);
		String s2 = new String(ch1);
		String res1 = s1+s2;
		System.out.println(res1);
		
	}

}
