class Test
{
static int i;
int j;
static{
i=10;
System.out.println("Static Block called");
}
}
class Static{
public static void main(String[] args)
{
System.out.println(Test.i);
}
}