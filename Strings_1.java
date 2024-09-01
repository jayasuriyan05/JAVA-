package basics;
import java.util.Scanner;
public class Strings_1 {
public static void main(String[] args) {
	String st = "Jaya Suriyan";
	System.out.println(st.equals(st));
	st = st +" from Tiruppur";
	System.out.println(st);
	st = st.concat(" BE ECE");
	System.out.println(st);
	System.out.println(st.endsWith("ya"));
	System.out.println(st.compareTo("Surya"));
	System.out.println(st.indexOf('i'));
	System.out.println(st.lastIndexOf("n"));
	System.err.println(st.contains("Jaya"));
	System.out.println(st.indexOf('i',4));
	System.out.println(st.trim());
	System.out.println(st.replace('a', '&'));
	System.out.println(st.length());
	System.out.println(st.substring(5,7));	
	
}
}
