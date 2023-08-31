package power5;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Armstrong theArmstrong=new Armstrong();
		boolean res=theArmstrong.isArmstrong(num);
		if(res==true)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is Not Armstrong");
		}
		scan.close();
	}
}
