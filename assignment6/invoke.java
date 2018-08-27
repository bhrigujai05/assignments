import java.util.*;
import java.lang.*;
import java.io.*;
class parents
{
  int i=25;
  public void print()
  {
    System.out.println(" parent class "+i);
  }
}
class child extends parents
{
  child()
  {
    super.print();
  }
}
class invoke
{
  public static void main(String []args)
  {
    child c=new child();
  }
}
