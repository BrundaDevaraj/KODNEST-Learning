package factorialcailculator;

import java.util.Scanner;

public class Main {
	public static void calculateFactorial(int n)
	{

	int factorial=1;
	for(int i=1;i<=n;i++)
	{
		factorial *=i;
		
		System.out.println(factorial);
	}

	}
	public static void main(String[] args)
	{

	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateFactorial(n);
	scan.close();

	}

}
