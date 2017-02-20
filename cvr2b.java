import java.util.Scanner;
class cvr2b
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char prev='p',ch;
	for(i=0;i<n;i++)
	{
		ch=s.charAt(i);
		switch(ch)
		{
			case 'R':
				j++;
				prev='R';
				break;
				
			case 'G':
				if(prev=='G'&&ch=='G')
				{
					continue;
				}
				j++;
				prev='G';
				break;
		}
		
	}
	System.out.println(j-1);
	}
}