package numbertableprinter;

import java.util.Scanner;

public class Main {	
	public static void printTable(int num)
	{
	for(int i=1;i<=10;i++)
	{
		int result = num * i;
        System.out.print(num + " x " + i + " = " + result);
    }
	}
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	printTable(num);
	scan.close();
	}
	}