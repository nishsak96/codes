import java.util.*;
class unlock
{
	public static void main(String arg[])
	{
		int m=-1,size,t,n,key,i,j,d,k=0,s=0;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		if(t<1||t>1000)
			System.exit(1);
		int op[]=new int[t];
		for(i=1;i<=t;i++)
		{
			s=0;
			for(j=0;j<10;j++)
			{
				a[j]=sc.nextInt();
				if(a[j]<1||a[j]>1000)
					System.exit(1);
			}
			
			size=sc.nextInt();
			key=sc.nextInt();
			k=key;
			while(k!=0)
			{
				
				d=k%10;
				k=k/10;
				s=s+a[d];

			}
			if(s<1||s>1000)
				System.exit(1);
			op[++m]=s;
		}
		for(i=0;i<=m;i++)
			System.out.println(op[i]);
	}
}