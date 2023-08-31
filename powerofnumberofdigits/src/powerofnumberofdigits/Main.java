package powerofnumberofdigits;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num=scan.nextInt();
		 Power power=new Power();
		 int digi=power.countdigits(num);
		 int res=power.raiseToPower(num, digi);
		 System.out.println("result when "+num+" raiesd to power "+digi+" is: "+res);
		 scan.close();
	    }
	}