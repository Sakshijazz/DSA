package Day14;

import java.util.Scanner;

class LNode
{
	int val;
	LNode next;
	LNode(int d)
	{
		val= d;
		next= null;
	}
}

class LinkedList
{
	LNode head;
	LNode tail;

	void push(LNode new_node)
	{
		if(head == null && tail == null)
		{
			head= tail= new_node;
			return;
		}
		tail.next= new_node;
		tail= new_node;
	}
	
	void printlist()
	{
		LNode temp= head;
		while(temp!= null)
		{
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class sort_0_and_1
{
	public LNode sortbinary(LNode head)
	{
		int count0= 0, count1= 0;
		LNode curr= head;
		while(curr!=null)
		{
			if(curr.val==0)
			{
				count0++;
			}
			else
			{
				count1++;
			}
			curr= curr.next;
		}
		curr= head;
		while(curr!=null)
		{
			if(count0>0)
			{
				curr.val= 0;
				count0--;
			}
			else
			{
				curr.val= 1;
			}
			curr=curr.next;
		}
		return head;
	}
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n= scan.nextInt();
		LinkedList llist= new LinkedList();
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		{
			int data= scan.nextInt();
			llist.push(new LNode(data));
		}
		sort_0_and_1 obj= new sort_0_and_1();
		LNode sortedHead = obj.sortbinary(llist.head);
		llist.head= sortedHead;
		llist.printlist();
	}
}
