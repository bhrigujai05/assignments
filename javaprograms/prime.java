import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
int n=s.nextInt();
int i,j;
int c=0;
for(i=1;i<=n;i++)
{
	c=0;
 for(j=1;j<=i;j++)
 {
   if(i%j==0)
   {
      c++;
   }
   }
 }
 System.out.println(c);
 if(c==2)
 {
System.out.println("prime number is:- "+n);
}
else
{
System.out.println("Not prime number is:- "+n);	
}
}
}