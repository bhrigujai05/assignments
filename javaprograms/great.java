import java.util.Scanner;
class great
{
	public static void main(String args[])
	{
	  int a,b,c,d;
	  Scanner sc= new Scanner(System.in);
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
    d=a>b?a:b>c?b:c;
    System.out.println("greatest number:"+d);
	}
}