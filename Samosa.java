import java.util.*;
class Samosa
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int t=sc.nextInt();
		Courier cr=new Courier();
		for(i=t;i>=0;i--)
		{
			cr.input();
			cr.process();
		}
	}
}

class Courier
{
	int a[]=new int[1000000];
	int n,k,s=0;
	double d=0;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		int i;
		n=sc.nextInt();
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	void process()
	{
		int i,j;
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				d=Math.pow(Math.abs(a[i]-a[j]),k);
				s=s+(int)d;
			}
		System.out.println(s);
	}
}