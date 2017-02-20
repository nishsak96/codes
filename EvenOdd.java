import java.io.*;
class EvenOdd
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t,i;
		long x=0;
		t=Integer.parseInt(br.readLine());
		for(i=t;i>0;i--)
		{
			x=func();
			System.out.println(x%1000000007);
		}
		
	}
	
	public static long func() throws IOException
	{
		long n,i,sum=0;
		int j,c=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Long.parseLong(br.readLine());
		String s;
		char ch;
		i=3;
		int m=0;
		while(n!=0)
		{
			m=i;
			c=0;
			//s=Long.toBinaryString(i);
			while(m!=0)
			{
				s=s+(m%2);
				m=m/2;
			}
			for(j=s.length()-1;j>=0;j--)
			{
				ch=s.charAt(j);
				if(ch=='1')
					c++;
			}
			
			if(c==2)
			{
				sum=sum+i;
				n--;
			}
			i++;
			
		}
		return sum;
	}
}