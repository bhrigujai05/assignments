import java.io.*;
interface animal
{
void say();
void eat();
}
 class cat implements animal
{
	public void eat()
{
System.out.println("cats");
}
	public void say()
{
System.out.println("meow");
}

}
class dog implements animal
{
public void say()
{
System.out.println("barks");
}
public void eat()
{
System.out.println("dogs");
}
}
class interfaces 
{
	public static void main(String args[])
	{
          cat c=new cat();
          c.say();
          c.eat();
dog d=new dog();
          d.say();
          d.eat();
	}
}