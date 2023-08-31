import java.util.Scanner;
public class Taxcalculatorapp {

		public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			System.out.println("enter the purchase amount");
			double purchaseamount=scan.nextDouble();
			System.out.println("enter the tax rate(in decimal point)");
			double taxrate=scan.nextDouble();
			double Totalcost=method.calculateTotalWithTax(purchaseamount,taxrate);
			System.out.println("Total cost including tax: "+Totalcost);
			scan.close();
		}
	}