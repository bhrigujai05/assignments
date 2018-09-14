import java.util.*;
class maxfr
{
	public static char maxfreq(String S)
	{
		int a[]=new int[256];
		for(int i=0;i<g.length();i++)
		{
			a[g.charAt(i)]++;
		}
		int max = -1;
		char m=' ';
		for(int i=0;i<g.length();i++)
		{
			if(max<a[g.charAt(i)])
			{
				max=a[g.charAt(i)];
				m=g.charAt(i);
			}
		}
		return m;
	
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String g=sc.next();
	System.out.print("Max frequency character " +maxfreq(g));
}
}