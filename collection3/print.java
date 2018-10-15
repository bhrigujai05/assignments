import java.util.*;
class generic
{
	public static <T> void display(T[] o)
	{
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]+" ");
		}
	}
}
public class printarray
{
	public static void main(String[] x)
	{
		Integer arr[]={1,2,3,4,5};
		Double arr1[]={4.2,2.5,3.6,9.2,4.7};
                Character arr3[]={'n','b','k','l','p'};
		String arr2[]={"hello","hor","?"};
		generic.display(arr);
		generic.display(arr1);
		generic.display(arr2);
		generic.display(arr3);
	}
}