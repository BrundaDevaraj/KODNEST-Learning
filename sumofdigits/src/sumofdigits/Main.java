package sumofdigits;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	calculatesum c1 = new calculatesum();
	c1.calculateSumOfDigits(n);
	scan.close();
	}
}