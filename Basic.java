
//*.Write a program that takes 5 numbers as input the program that will take and then print the cumulative sum of the numbers?
import java.util.Scanner;
class  Basic
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int sum=0;
		System.out.println("enter the input numbers");
		for(int i=1;i<=5;i++)
		{
			int a=scan.nextInt();
			sum+=a;
		}
		 System.out.println("the sum of the input number is"+sum);
	 }
	
}
