import java.util.Scanner;
class found 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,i,flag=0;
	System.out.println("Enter the number");
	b=sc.nextInt();
	int a[]=new int[b];
	for(i=0;i<b;i++)
	{
       a[i]=sc.nextInt();
	}
    int l;
    l=sc.nextInt();
    for(i=0;i<b;i++)
    {
    	if(a[i]==l)
    	{
         flag=1;
    	}
    }
    if(flag==1)
    {
    	System.out.print("number is present");
    }
    else
    {
    	System.out.print("number is not present");
    }
	}
}