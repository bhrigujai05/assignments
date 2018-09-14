import java.util.*;
public class toggle {
    private static String change(String s)
     {
    	char ar[]=s.toCharArray();
    	String n="";
    	for(int i=0;i<ar.length;i++)
    	{
    		if((int)ar[i]>=97 && (int)ar[i]<=123)
    		{
    			n=n+(char)((int)ar[i]-32);
    		};
    		else if((int)ar[i]>=65 && (int)ar[i]<=91)
    		{
    			n=n+(char)((int)ar[i]+32);
    		}
    		else
    		  return "enter correct input";	
    	}
    	return n;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		String s=scan.next();
		System.out.println(change(s));
	}
}