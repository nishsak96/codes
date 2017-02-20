import java.util.*;
class Framing
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1.CharCount\n2.ByteStuffing\n3.BitStuffing");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				charCount();
				break;
			case 2:
				byteStuffing();
				break;
			case 3:
				bitStuffing();
				break;
		}
	}
	
	public static void charCount()
	{
		Scanner sc=new Scanner(System.in);
		String frm,sendFrm="",recFrm="";
		System.out.println("Enter the no of frames:");
		int noOfFrms=sc.nextInt();
		int i;
		for(i=noOfFrms;i>0;i--)
		{
			frm=sc.next();
			sendFrm=sendFrm+((frm.length())+1)+frm;
		}
		
		System.out.println("Sender : "+sendFrm);
		i=0;
		char ch,c;
		int cnt,temp;
		while(i<sendFrm.length()-1)
		{
			ch=sendFrm.charAt(i);
			cnt=(int)ch-48;
			temp=i;
			for(int j=i+1;j<=temp+cnt-1;j++)
			{
				c=sendFrm.charAt(j);
				recFrm=recFrm+c;
				i++;
			}
			i++;
		}
		System.out.println("Receiver : "+recFrm);
	}
	
	public static void byteStuffing()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		String sendFrm="",recFrm="",frm;
		char flag='#',esc='.';
		System.out.println("Enter the data:");
		frm=sc.nextLine();
		StringBuffer stb=new StringBuffer(frm);
		for(i=frm.length()-1;i>=0;i--)
		{
			if(frm.charAt(i)==flag||frm.charAt(i)==esc)
			{
				stb.insert((i),("."));
			}
		}
		frm=stb.toString();
		sendFrm=flag+frm+flag;
		System.out.println("Sender : "+sendFrm);
		i=1;
		char ch;
		while(i<sendFrm.length()-1)
		{
			ch=sendFrm.charAt(i);
			if(ch==esc)
			{
				recFrm=recFrm+sendFrm.charAt(i+1);
				i+=2;
				continue;
			}
			i++;
			recFrm=recFrm+ch;
		}
		System.out.println("Receiver : "+recFrm);
	}
	
	public static void bitStuffing()
	{
		/*int i;
		String sendFrm="",recFrm="";
		Scanner sc=new Scanner(System.in);
		String flag="A01111110A";
		String chk="011111";
		String data=sc.nextLine();
		StringBuffer stb=new StringBuffer(data);
		if(data.length()>6)
		{	
		for(i=0;i<(data.length()-6);i++)
		{
			if(data.charAt(i)=='0')
			{
				if(data.substring(i,i+6).equals(chk))
				{
					System.out.println("!-!");
					stb.insert(i+6,"a");
				}
			}
		}
		data=stb.toString();
		System.out.println("Sender : "+flag+data+flag);
		System.out.println(data.substring(i,i+6));
		
		for(i=0;i<(data.length()-6);i++)
		{
			if(data.charAt(i)=='0')
			{
				if(data.substring(i,i+6).equals(chk))
				{
					recFrm=recFrm+data.substring(i,i+6);
					i+=6;
					continue;
				}
			}
			recFrm=recFrm+data.charAt(i);
		}
		System.out.println("Receiver : "+recFrm);	
		}
		else
		{
			System.out.println("Sender : "+data);
			System.out.println("Receiver : "+data);
		}*/
		
		int i,ones=0;
		String flag="aa";
		String frm,sendFrm="",recFrm="xxx";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data: ");
		frm=sc.next();
		StringBuffer stb=new StringBuffer(frm);
		for(i=0;i<frm.length();i++)
		{
			ones=0;
			if(frm.length()>5)
			{
				if(frm.charAt(i)=='0'&&i<=(frm.length()-6))
				{
					i++;
					while(frm.charAt(i)=='1'&&ones<5)
					{
						ones++;
						i++;
					}
					if(ones==5)
					{
						stb.insert(i,'x');
						frm=stb.toString();
						System.out.println(frm);
					}
					continue;
				}
			}
			i++;
		}
		frm=stb.toString();
		sendFrm=flag+frm+flag;
		System.out.println("Sender : " + frm);
		
		
		for(i=0;i<frm.length();i++)
		{
			System.out.println("First:");
			System.out.println(recFrm);
			ones=0;
			if(frm.length()>5)
			{
				if(frm.charAt(i)=='0'&&i<=(frm.length()-6))
				{
					System.out.println("if");
					recFrm=recFrm+frm.charAt(i);
					System.out.println(recFrm);
					i++;
					while(frm.charAt(i)=='1'&&ones<5)
					{
						System.out.println("while");
						recFrm=recFrm+frm.charAt(i);
						System.out.println(recFrm);
						ones++;
						i++;
						
					}
					if(ones==5)
					{
						System.out.println("ones");
						recFrm=recFrm+frm.charAt(i+1);
						System.out.println(recFrm);
						i+=2;
					}
					recFrm=recFrm+frm.charAt(i);
					//if(frm.charAt(i)=='0')
					//i++;
					continue;
				}
			}
			System.out.println("normal");
			recFrm=recFrm+frm.charAt(i);
			System.out.println(recFrm);
		}
		System.out.println("Receiver : " + recFrm);
				
	}
}