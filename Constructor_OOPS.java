package basics;
import java.util.Scanner;
class NGP{
	int roll;
	String name;
	String dept;
	NGP(){
		System.out.println("No values are there");
	}
	NGP(int r,String n, String d){
		roll = r;
		name = n;
		dept = d;
	}
	void disp()
	{
		System.out.println(roll+"\t"+name+"\t"+dept);
	}
}
public class Constructor_OOPS {
public static void main(String[] args) {
	NGP ob = new NGP(50,"Surya","ECE");
	ob.disp();
	NGP ob1 = new NGP(27,"Dhanush","ECE");
	ob1.disp();
	NGP ob2 = new NGP();
}
}
