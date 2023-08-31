public class method {
	public static double calculateTotalWithTax(double purchaseamount,double taxrate)
	{
		double Totalcost=(purchaseamount * taxrate)+purchaseamount;
		return Totalcost;
	}
}