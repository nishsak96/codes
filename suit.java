import java.util.*;
class suit
{
	public static void main(String arg[])
	{
		int p=0,i,j,t;
       		double area=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int len[]=new int[t];
		int no[]=new int[t];
		for(i=0;i<t;i++)
		{
			len[i]=sc.nextInt();
			no[i]=sc.nextInt();
			area=area+(no[i]*(Math.pow(Math.pow(2,len[i]),2)));
		}
		
		while(area>(Math.pow(Math.pow(2,p),2)))
		{
			p++;
		}
		System.out.println(p);
	}
}