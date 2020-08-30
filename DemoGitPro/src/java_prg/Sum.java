package java_prg;

import java.util.Scanner;

public class Sum
{

	public static void main(String[] args) 
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: " );
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of two numbers: "+sum);
		System.out.println("Line to check my change!!");
		System.out.println("Hi from git");
		sc.close();

	}

}
