import java.util.*;
import java.lang.*;
class parent
{
    parent()
    {
     System.out.println("constructor called ");   
    }
    parent(int i)
    {
      this();
    }
}
class  defaultconstructor
{
    public static void main(String []args)
    {
       parent p=new parent(10);
    }
}