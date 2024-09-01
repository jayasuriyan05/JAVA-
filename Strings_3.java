package basics;
import java.util.Scanner;
public class Strings_3 { 
	public static void main(String[] args) {
      String st = "HakkU nama tata is a famous word";
      String starr[] = st.split(" ");
      for(String s:starr)
      {
    	  s = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    	  System.out.println(s+" ");
      }
      System.out.println(st.length());
     

}
}
