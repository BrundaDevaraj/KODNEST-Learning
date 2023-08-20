package assignment;

public class Lableddowhilloop {
	public static void main(String[] args)
	{
		int i=1;
		data1:do 
		{
			int j=1;
			
			do {
				System.out.println("kodnest: "+i);
				i++;
				break data1;
				
				}while(j<5);
			
		}while(i<=5);
	}
}
