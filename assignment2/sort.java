import java.util.Scanner;
class sorts
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int d,i,j;
	d=sc.nextInt();
	int temp;
	int a[]= new int[d];
	for(i=0;i<d;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(i=0;i<d;i++)
	{
	for(j=i+1;j<d;j++)
	{
       if(a[i]>a[j])
       {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
       }
	}
	}
	for(i=0;i<d;i++)
	{
	  System.out.print(a[i]+" ");
	}
	}
}