import java.util.*;
class generic
{
	public static <T> void sort(T[] o)
	{
		LinkedList<T> l1=new LinkedList<T>();
		for(int i=0;i<o.length;i++)
		{
			l1.add(o[i]);
		}
		l1.sort(null);

		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]+" ");
		}
		
	}
	
}
public class sortarrays
{
	public static void main(String[] x)
	{
		Integer arr[]={1,2,3,4,5,6};
		Double arr1[]={1.2,5.6,4.8,9.2,4.6};
		String arr2[]={"amg","aob","lkj","irc"};
		Character arr3[]={'a','b','c','d','e'};
		generic.sort(arr);
		generic.sort(arr1);
		generic.sort(arr2);
		generic.sort(arr3);
	}
}