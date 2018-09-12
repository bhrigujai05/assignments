import java.io.*;
class abc
{
public static void main(String args[])
throws Exception{
FileReader f = new FileReader("abc.txt"); 
int i; 
while ((i=f.read()) != -1) 
{
System.out.print((char) i);
}
System.out.println("\n");
File file  = new File("abc.txt");
String path= file.getAbsolutePath();
System.out.print(path);	
}	
}