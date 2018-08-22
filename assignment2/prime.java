import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner (System.in);
	int d,i,j;
	int count=0;
	System.out.println("Enter the Numbe ");
	d=sc.nextInt();
	for(i=1;i<d;i++)
	{
	  count=0;
	for(j=1;j<=i;j++)
	{
      if(i%j==0)
      {
      count++;
      }
	}
	if(count==2)
	{
	 System.out.println(i+" is prime number");
	}
	}
	}
}