import java.util.*;
import java.lang.*;
class Static
{
  static void hello()
  {
    System.out.print("static ");
  }
  void world()
  {
    System.out.print("block example");
  }
  public static void main(String [] aa)
  {
     Staticexp rc=new Staticexp();
     hello();
     rc.world();
  }
}