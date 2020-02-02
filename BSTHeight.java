import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
}

public class BSTHeight {

	static Node root;
	static int n;
	
	BSTHeight()
	{
		root = null;
	}
	public static void insert(int data)
	{
		root = insertitem(root,data);
	}
	public static Node insertitem(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
		}	
		else
		{
			if(data < root.data)
				root.left = insertitem(root.left,data);
			
			else if(data > root.data)	
				root.right = insertitem(root.right,data);	
		}
		return root;
	}
	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int countl = height(root.left);
			int countr = height(root.right);
			
			if(countl > countr)
				return ++countl;
			else
				return ++countr;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTHeight bst = new BSTHeight();
		
		insert(100);
		insert(30);
		insert(120);
		insert(20);
		insert(60);
		insert(50);

		System.out.println(height(root));
	}	
	
}