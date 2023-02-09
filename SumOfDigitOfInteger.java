package thursdayLab2;
import java.util.Scanner;

public class SumOfDigitOfInteger {

	public static void main(String[] args) {  
		int num, sum;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		num=sc.nextInt();   
		for(sum=0; num!=0; num=num/10)  
		{       
		sum = sum + num % 10;  
		}  
		System.out.println("Sum of digits: "+sum);  
		}  
		}  