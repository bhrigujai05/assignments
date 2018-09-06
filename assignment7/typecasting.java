
import java.util.Scanner;
class typecastingstring
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
public void max()
	{
		if(a>b)
		{
			System.out.println(a+" greater");
		}
		else if(a==b)
		{
			System.out.println("equal");
		}
		else if(b>a)
		{
			System.out.println(b+"greater");
		}
	}
	public static void main(String args[])
	{
		typecastingstring a=new typecastingstring();
		a.max();
	}
}
