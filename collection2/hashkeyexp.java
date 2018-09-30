import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class hashkeyexp
{
	public static void main(String args[])
	{
		Map<String,Integer> o=new HashMap<>();
		o.put("x",new Integer(932));
		o.put("y",new Integer(934));
		o.put("z",new Integer(936));
		o.put("x",new Integer(938));
Set<Map.Entry<String,Integer>> j=o.entrySet();
Iterator i=j.iterator();
while(i.hasNext())
{
	Map.Entry m=(Map.Entry)i.next();
	System.out.print(m.getKey()+":");
	System.out.print(m.getVakue());

	}
}
}