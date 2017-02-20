import java .util.*;
class djlocker
{
	public static void main(String arg[])
	{
		int i,j,c,n;
		long ii;
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		for(ii=1;ii<=t;ii++)
		{
			c=0;
			n=sc.nextInt();
			boolean lock[]=new boolean[n];
			i=0;
			while(i<=n)
			{
				lock[i]=false;
				i++;
			}
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=n;j=j+i)
				{
					if(lock[j-1]==false)
						lock[j-1]=true;
					else
						lock[j-1]=false;
				}
			}
			for(i=0;i<n;i++)
			{
				if(lock[i]==true)
					c++;
			}
			System.out.println(c);
		}
	}
}