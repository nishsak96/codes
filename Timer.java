class Timer
{
	public static void main(String arg[])
	{
		for(int i=(Integer.parseInt(arg[0]))-1;i>=0;i--)
		{
			try{
			Thread.sleep(1000);}
			catch(Exception e)
			{}
			System.out.println(i);
		}
	}
}