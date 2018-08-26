import java.lang.*;
import java.util.*;
class Complex
{
  int a,b;
  public void getdata()
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the real");
    a=ss.nextInt();
    System.out.println("enter the img");
    b=ss.nextInt();
    ss.close();
  }
  public void display()
  {
    System.out.println(a+"+"+b+"i");
  }
}
class Complexno
{
  public static void main(String [] aa)
  {
    Complex rc=new Complex();
    rc.getdata();
    rc.display();
  }
}