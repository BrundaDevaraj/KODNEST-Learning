package powerof2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		Power1 p1=new Power1();
		int res=p1.raiseToTwo(num);
		System.out.println(res);
		scan.close();
		}
}