import java.util.*;
class ShiftNAdd
{
	int decToBi(int n,int a[],int c)
	{
		i=c-1;
		while(n!=0||i>-1)
		{
			a[i]=n%2;
			n=n/2;
			i--;
		}
		return a;
	}
	
	int rightShift(int o,int arr[])
	{
		for(int i=count-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		a[0]=o;
		return a;
	}

	void biToDec(int a[])
	{
		int s;
		for(int i=0;i<n;i++)
		{
			s=s+(a[i]*Math.pow(2,i));
		}
		System.out.println("The answer is:"+s);
	}
}

class OkayMulti
{
	int a[],q[],c,m[],count=0;
	a[]=new int[10];
	q[]=new int[10];
	m[]=new int[10];
	public static void main(String arg[])
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos to multiply");
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>n)
			temp=m;
		else
			temp=n;
		while(temp!=0)
		{
			temp=temp/2;
			count++;
		}
	ShiftNAdd sna=new ShiftNAdd();
	sna.decToBi(m,)