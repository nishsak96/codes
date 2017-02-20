import java.util.*;
class CatDog
{
	public static void main(String arg[])
	{
		int n,i,j,x,y;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(i=t;i>0;i--)
		{
			calc();
		}
	}
	
	public static void calc()
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		BigInteger big=new BigInteger(x);
		String x=sc.nextLine();
		BigInteger big1=new BigInteger(x);
		BigInteger temp=new BigInteger("");
		BigInteger two=new BigInteger("2");
		if(big.compareTo(big1)<0)
		{
			temp=big;
			big=big1;
			big1=temp;
		}
		if((big.subtract(big1)).compareTo(big.divide(two))<0)
		{
			if((big.subtract(big1)).compareTo(BigInteger.ZERO))
				System.out.println(1);
			else
				System.out.println((big.subtract(big1));
		}
		else
			System.out.println(-1);
	}
}