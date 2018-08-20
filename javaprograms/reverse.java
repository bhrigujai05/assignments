import java.util.Scanner;
class rev
{
	public static void main(String args[])
	{
	int a,t=0,y=0;
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	while(a!=0)
	{
	t=a%10;
	y=y*10+t;
	a=a/10;
	}
	System.out.println("reverse Number is:- "+y);
	}
}