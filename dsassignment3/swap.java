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
public void swap()
{
    node temp=head;
    if(temp.data>=temp.next.data)
    {
        int j=temp.data;
        temp.data=temp.next.data;
        temp.next.data=j;
        temp=temp.next;
    }
    else
    {
        temp=temp.next;
    }
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
System.out.println("before swap");
ll.display();
ll.swap();
System.out.println("after swap two elements");
ll.display();
}
}
