import java.util.*;
import java.util.Stack;
public class using2queue
{
	public static void main(String[] args) {
		Stack s=new Stack();
		Stack s1=new Stack();
          s.push(10);
          s.push(20);
          s.push(30);
          s.push(40);
          s1.push(s.pop());
             s1.push(s.pop());
                s1.push(s.pop());
                   s1.push(s.pop());

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
	}
}