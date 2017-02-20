import java.util.*;
class cvr2c
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer stb;
		String start,end,diff="0",str;
		int i,j=0,k=0,m=0,d=0,e=0;
		d=Integer.parseInt(diff);
		e=d;
		str=sc.nextLine();
		String a[]=str.split(",");
		start=a[0];
		end=a[1];
		diff=a[2];
		int plotcount=0;
		if(Integer.parseInt(start)>Integer.parseInt(end))
		{
			str=start;
			start=end;
			end=str;
		}
		
		String s="",r="";
		int pali[]=new int[10000];
		int di[]=new int[10000];
		if(Integer.parseInt(diff)==0)
		{
			System.out.print(0+","+0+","+0);
			System.exit(0);
		}
		
		if(!start.equals(end))
		{		
		for(i=Integer.parseInt(start);i<=Integer.parseInt(end);i++)
		{
			s=Integer.toString(i);
			stb=new StringBuffer(s);
			stb.reverse();
			r=stb.toString();
			if(r.equals(s))
			{
				pali[j]=Integer.parseInt(s);
				j++;
			}
		}
		
		if(j<1)
		{
			System.out.print(0+","+0+","+0);
			System.exit(0);
		}
		else if(j==1)
		{
			System.out.print(1+","+pali[j-1]+","+pali[j-1]);
			System.exit(0);
		}
		
		for(i=0;i<j-2;i++)
		{
			if(Math.abs(pali[i]-pali[i+1])>Integer.parseInt(diff))
			{
				di[k]=-1;
				k++;
			}
			else
			{
				di[k]=Math.abs(pali[i]-pali[i+1]);
				k++;
			}
		}
		int lowest=Integer.MAX_VALUE;
		
		
		for(k=0;k<j-2;k++)
		{
			if(di[k]<lowest&&di[k]!=-1)
			{
				d=e;
				plotcount=2;
				lowest=di[k];
				i=k;
				m=k;
				d=d-di[k];
			}
			else if(di[k]==lowest)
			{
				d=d-di[k];
				plotcount++;
				m=k;
			}
		}
		
		System.out.print(plotcount+","+pali[i]+","+pali[m+1]);
		}
		else
		{
			System.out.print(0+","+0+","+0);
		}
	}
}