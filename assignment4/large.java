import java.lang.*;
import java.util.*;
class large
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner (System.in);
    int a,i=0,temp=0;
    System.out.println("enter the size");
    a=ss.nextInt();
    int b[]=new int [a];
    for(i=0;i<a;i++)
    {
      b[i]=ss.nextInt();
    }
    for(i=0;i<a-1;i++)
    {
      for(int j=0;j<a-i-1;j++)
      {
        if(b[j]>b[j+1])
        {
          temp=b[j];
          b[j]=b[j+1];
          b[j+1]=temp;
        }
      }
    }
    System.out.println(b[a-2]);
  }
}