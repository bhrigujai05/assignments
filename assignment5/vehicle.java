class Vehicle
{
public void start()
{
System.out.println("Start vehicle");
}
public void stop()
{
System.out.println("stop vehicle");
}
}
class twowheeler extends Vehicle
{
public void start()
{
System.out.println("start twowheeler");
}
public void stop()
{
System.out.println("stop twowheeler");
}}
class fourwheeler extends Vehicle
{
public void start()
{
System.out.println("start fourwheeler");
}
public void stop()
{
System.out.println("stop fourwheeler");
}
}
class Abstract
{
public static void main(String args[])
{
twowheeler t=new twowheeler();
fourwheeler f=new fourwheeler();
t.start();
t.stop();
f.start();
f.stop();
}
}
