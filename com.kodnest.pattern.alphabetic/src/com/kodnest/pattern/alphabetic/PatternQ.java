package com.kodnest.pattern.alphabetic;

public class PatternQ
{
	public static void main(String[] args)
	{
		    int n=11;
		    for (int i = 0; i<=n/2; i++)
		    {
		        for (int j = 0; j <=n/2; j++)
		        {
		            if (i==0||j==0||i==n/2||j==n/2)
		            System.out.print("*");
		            else
		            System.out.print(" ");
		        }
		        System.out.println();
		    }
		    for (int i =n/2; i<=n; i++)
		    {
		        for (int j = 1; j <=n; j++)
		        {
		            if (i==j)
		            System.out.print("*");
		            else
		            System.out.print(" ");
		        }
		        System.out.println();
	}
}
}