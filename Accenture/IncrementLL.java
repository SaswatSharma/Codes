import java.util.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Node head;
		Node first=new Node(sc.nextInt());
		head=first;
		Node temp1=first;
		while(sc.hasNextInt())
		{
			Node temp=new Node(sc.nextInt());
			temp1.next=temp;
			temp1=temp;
		}
		temp1.next=null;
		System.out.println("Before:-");
		display(head);
		System.out.println();
		System.out.println("After:-");
		increment(head);
		display(head);
	}
	public static void display(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.value+"->");
			head=head.next;
		}
		System.out.print("null");
	}
	public static void increment(Node head)
	{
 	   /*In short, you arre indeed modifying the list
        nodes through pass-by-reference, but any reassignment 
        of head inside increment only affects the local reference
        within that method. This is why modifying node values 
        works as expected but the original head reference in main remains unchanged.*/
        
    /*head is a stack variable which contains the address of a node object
    and when it is passed as argument in a function a copy of the value of 
    the address is passed and that is why we are able to access the object
    but if any updation made in head only brings a change in local head variable*/

		int first=head.value;
		int second=head.next.value;
		int third;
		head=head.next.next;
		while(head!=null)
		{
			third=head.value;
			head.value=third+first;
			first=second;
			second=third;
			head=head.next;
		}
	}
}
class Node
{
	int value;
	Node next;
	Node(int value)
	{
		this.value=value;
	}
	Node(int value,Node next)
	{
		this.value=value;
		this.next=next;
	}
}