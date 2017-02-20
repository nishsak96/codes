import java.util.*;
class test1
{
	public static void main(String arg[])
	{
		StringBuffer stb=new StringBuffer("0123456789");
		stb.insert(5,'a');
		System.out.println(stb.toString());
	}
}