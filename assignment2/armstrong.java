import java.util.Scanner;	
class armstrong 
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int a,y,r;
  System.out.println("Enter the Number");
	y=0;
	a=sc.nextInt();
   int s;
   s=a;

   while(a!=0)
   {
     r=a%10;
     y=y+(r*r*r);
     a=a/10;
   }
   if(s==y)
   {
   System.out.println(s+"is Amstrong Number");
   }
   else
   {
   System.out.println("Not a amstrong number");
   }
}
}