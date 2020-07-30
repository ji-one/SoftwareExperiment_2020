package mon_test;

public class Calc {
	
	public int Factorial(int num)
	{
		
		if(num == 0) return 1;
		
		int rst=1;
		
		for(int i=1; i<=num;i++)
		{
			rst*=i;
		}	
		
		return rst;	
	}

}
