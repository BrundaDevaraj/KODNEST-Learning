package bitcounter;

public class method 
{
	public static int countSetBits(int number)
	{
		int count=0;
		while(number>0) 
		{
			count+=number&1;
			number>>=1;
		}
		return count;
	}
}