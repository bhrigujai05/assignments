import java.util.*;
public class linklist
{
class node{
int data;
node next;
node(int d)
{
data=d;
}
}
node head;
public void insert(int data)
{
node temp=new node(data);
if(head==null)
{
head=temp;
}
else
{
temp.next=head;
head=temp;
}
}
public void reverse()
{
   node temp=head;
   node prev = null; 
        node current = head; 
        node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev;
   

}
public void display()
{
node temp=head;
while(temp!=null)
{
System.out.println(temp.data+"");
temp=temp.next;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
linklist ll=new linklist();
for(int i=0;i<5;i++)
{
int n=sc.nextInt();
ll.insert(n);
}
ll.reverse();
ll.display();
}
}
