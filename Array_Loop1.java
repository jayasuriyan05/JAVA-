package basics;
import java.util.Scanner;
public class Array_Loop1 {
	public static void main(String[] args) {
		int [] fr = {98,97,95,96,99};
		for(int i=0; i<fr.length; i=i+3-1)
		{
			System.out.println("Index:"+i+"\tElement: "+fr[i]);
		}
		for(int i=fr.length-1; i>=0; i=i-2)
			{
			System.out.println("Index:"+i+"\tElement: "+ fr[i]);
		}
		for(int i=fr.length-1; i>=0; i--)
		{
		    System.out.println("Index:"+i+"\tElement: "+ fr[i]);
		}
		for(int i=0; i<fr.length; i++)
		{
					System.out.println("Index:"+i+"\tElement: "+fr[i]);
		}
		
	
}

}