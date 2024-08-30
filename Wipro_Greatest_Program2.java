package basics;
import java.util.Scanner;
public class Wipro_Greatest_Program2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numCount = 3;
	        int[][] digitArrays = new int[numCount][4];
	 
	        int[] maxDigits = new int[4]; 

	        for (int i = 0; i < numCount; i++) {
	            System.out.printf("Enter 4-digit number %d: ", i + 1);
	            int number = scanner.nextInt();

	            if (number < 1000 || number > 9999) {
	                System.out.println("The number is not a 4-digit number.");
	                return;
	            }

	            digitArrays[i][0] = number / 1000;        
	            digitArrays[i][1] = (number / 100) % 10;   
	            digitArrays[i][2] = (number / 10) % 10;    
	            digitArrays[i][3] = number % 10;           

	            for (int j = 0; j < 4; j++) {
	                if (digitArrays[i][j] > maxDigits[j]) {
	                    maxDigits[j] = digitArrays[i][j];
	                }
	            }
	        }
	        int a=(digitArrays[2][0]>=digitArrays[2][1]&& digitArrays[2][0]>=digitArrays[2][2]&&digitArrays[2][0]>=digitArrays[2][3])?digitArrays[2][0]:(digitArrays[2][1]>=digitArrays[2][2]&& digitArrays[2][1]>=digitArrays[2][3])?digitArrays[2][1]:(digitArrays[2][2]>=digitArrays[2][3])?digitArrays[2][2]:digitArrays[2][3];
	        int maxNumber = maxDigits[0] * 1000 + maxDigits[1] * 100 + maxDigits[2] * 10 + maxDigits[3];
	        System.out.printf("%d%n", maxNumber);
	        int x= (digitArrays[1][1] * digitArrays[0][0]-a);
	        System.out.printf("%d%n", x);
	        scanner.close();
	    }
	}


