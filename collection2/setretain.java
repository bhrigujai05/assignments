import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class setretain
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Set<String>p=new HashSet();
		Set<String>r=new HashSet();
	
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
		     p.add(s.next());
		}
        for(int i=0;i<n;i++)
		{
			r.add(s.next());
        }			
		p.retainAll(r);
		System.out.print(p);
	}
}
