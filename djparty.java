import java .util.*;
class djparty
{
	public static void main(String arg[])
	{
		int j,s,m,f;
		int i,q,k,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[(int)n];
		for(i=0;i<n;i++)
		{
			a[(int)i]=sc.nextInt();
		}
		q=sc.nextInt();
		for(j=1;j<=q;j++)
		{
			s=0;
			f=0;
			k=sc.nextInt();
			for(m=0;m<n;m++)
			{
				s=s+a[m];
				if(k<=s)
				{
					f=1;
					System.out.println(m+1);
					break;
				}
			}
			if(f==0)
				System.out.println(-1);
		}
	}
}