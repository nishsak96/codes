import java .util.*;
class djxor
{
	public static void main(String arg[])
	{
		
		int m=0,l,i,j=0,n,x=0,k=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(l=0;l<n;l++)
		{
			for(i=0;i<n;i++)
			{
				if(i!=k)
					x=x^a[i];
			}
			if(j<x)
			{
				j=x;
				m=k+1;
			}
			k++;
		}		
		System.out.println(m+" "+j);
	}
}