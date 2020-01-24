import java.util.*;

public class ReverseLL {

	Node head;
	static int n;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static void insert(ReverseLL l1, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(l1.head == null)
		{
			l1.head = newNode;
		}
		else
		{
			Node current = l1.head;
			
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public static void display(ReverseLL li)
	{
		Node current = li.head;
		System.out.println("The LinkedList is as follows: ");
		while(current.next != null)
		{
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println(current.data);
	}

	public static void rev(ReverseLL l1)
	{
		if(l1.head == null)
			System.out.println("No list");
		
		else
		{
			Node current,prev,next;
			prev = null;
			next = null;
			current = l1.head;
			
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			l1.head = prev;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		int i,n,ele;
		
		ReverseLL li = new ReverseLL();
		
		System.out.println("Enter the number of elements to insert");
		n = S.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			ele = S.nextInt();
			insert(li,ele);
		}
		rev(li);
		display(li);

	}

}
