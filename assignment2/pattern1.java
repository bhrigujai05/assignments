import java.util.Scanner;
class pattern
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int d,i,j;

   System.out.println("Enter the Number");
   d=sc.nextInt();
  for(i=0;i<d;i++)
  {
  for(j=0;j<d-i;j++)
  {
    System.out.print("*");
  }
    System.out.print("\n");
  }
  }
}