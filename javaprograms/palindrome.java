import java.util.Scanner;
class rev
{
public static void main(String args[])
{
int a,b=0,c=0;
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
int d=a;
while(a!=0)
{
b=a%10;
c=c*10+b;
a=a/10;
}
if(d==c)
{
System.out.println("palindrome number "+d );
}
else
{
	System.out.println("not a palindrome number "+d );
}
}
}