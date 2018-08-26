class Animal
{
String breed="labrador";
String color="brown";
public void speak()
{
System.out.println("Animal breed-"+breed);
System.out.println("Animal color-"+color);
}
}
class Dog extends Animal 
{
public void speak()
{
System.out.println("Barking");
}
}
class Cat extends Animal
{
public void speak()
{
System.out.println("Meowing");
}
}
public class Inheritance{
public static void main(String[] args){
Animal a=new Animal();
a.speak();
a=new Dog();
a.speak();
a=new Cat();
a.speak();
}
}