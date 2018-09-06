abstract class animal
{ 
String name,breed,color;
abstract void eat();
void say()
	{
		System.out.println("meow");
	}
}
class base extends animal 
{
 public void eat()
{
System.out.println("meow");
}
}
class abs
{
public static void main(String args[])
{
animal a=new base();
a.name="dog";
a.breed="tuffy";
a.color="black";
a.say();
a.eat();
		}
}