package bitcounter;

import java.util.Scanner;

public class bitcounterapp 
{
	public static void main(String args[])  
    {  
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scan.nextInt();
        int count=method.countSetBits(number);
        System.out.println("number of set bits: "+count);
        scan.close();
    }
}