package basics;
import java.util.Scanner;
public class Armstrong_Number {
public static void main(String[] args) {
	int num = 21 ;
	int count = 0;
	int sum = 0;
	int temp = num;
	while(num>0)
	{
		num = num/10;
		count++;
	}
	num = temp;
	while(num>0)
	{
	sum+= (int)Math.pow(num%10,count);
	num/=10;
	}
	if(temp == sum)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not a Armstrong Number");
	}
	
}
}
