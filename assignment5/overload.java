public class Test
{
    public void abc(Integer i)
    {
        System.out.println("abc(Integer ) ");
    }
    public void abc(String name)
    {
        System.out.println("abc(String ) ");
    }
    public static void main(String [] args)
    {
        Test ab= new Test();
        Integer arg=null;
ab.abc(arg);
    }
}
