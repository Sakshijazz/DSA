package Day13;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data= data;
		this.next= null;
	}
}

class Linkedlist
{
	 Node head;
	 Node tail;
//Add at the end
	public void add_at_end(int data)
	{
		Node new_node= new Node(data);
		if(head == null)
		{
			head= new_node;
			tail= new_node;
		}
		else
		{
			tail.next= new_node;
			tail= new_node;
		}
		
	}
//Delete
	public void delete(int data)
	{
		Node current= head;
		Node prev= null;
		
		if(current == null)
		{
			System.out.println("List is empty");
		}
		else if(head.data == data)
		{
			head.data= data;
		}
		
		while(current != null)
		{
			if(current.data == data)
			{
				prev.next= current.next;
			}
			prev= current;
			current= current.next;
		}
	}
//Search
	public boolean search(int data)
	{
		Node current= head;
		
		while(current != null)
		{
			if(current.data == data)
			{
				return true;
			}
			current= current.next;
		}
		return false;
	}
//Add at the start
	public void add_at_start(int data)
	{
		Node new_node= new Node(data);
		
		if(head == null)
		{
			head= new_node;
			tail= new_node;
		}
		else
		{
			new_node.next= head;
			head= new_node;
		}
	}
//Add at any position
	public void add_at_kposition(int data, int k) 
	{
		Node new_node= new Node(data);
		int i=0;
		Node current= head;
		
		if(k == 0)
		{
			add_at_start(data);
			return;
		}
		
		while(current != null)
		{
			i++;
			if(i == k-1)
			{
				new_node.next= current.next;
				current.next= new_node;
			}
			current= current.next;
		}
    }
//Reverse
	public void reverse() 
	{
		Node current= head;
		Node prev= null;
		Node next; 
		tail= head;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head= prev;
    }
//Delete at any position
	public void delete_at_kposition(int k)
	{
		Node current= head.next;
		Node prev= head;
		int i=1;
		
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		if(k == 0)
		{
			head= head.next;
		}
		else
		{
			while(current != null)
			{
				if(i == k-1)
				{
					prev.next= current.next;
					return;
				}
				prev= prev.next;
				current= current.next;
				i++;
			}
		}
	}
	
	public void printlist()
	{
		Node current= head;
		if(current == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(current != null)
			{
				System.out.print(current.data+ " ");
				current= current.next;
			}
		}
	}
}
public class LL_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list= new Linkedlist();
		list.add_at_end(1);
		list.add_at_end(2);
		list.add_at_end(3);
		list.add_at_end(4);
		list.add_at_end(5);
		
		System.out.println("Original List:");
		list.printlist();
		System.out.println();
		
		System.out.println("Add_at_end List:");
		list.add_at_end(6);
		list.printlist();
		System.out.println();
		
		System.out.println("Delete List:");
		list.delete(3);
		list.printlist();
		System.out.println();
		
		System.out.println("Search List:");
		if(list.search(4))
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element not Found");
		}
		
		System.out.println("Add_at_start List:");
		list.add_at_start(0);
		list.printlist();
		System.out.println();
		
		System.out.println("Add_at_k_position List:");
		list.add_at_kposition(100,2);
		list.printlist();
		System.out.println();
		
		System.out.println("Reverse List:");
		list.reverse();
		list.printlist();
		System.out.println();
		
		System.out.println("Delete_at_k_position List:");
		list.delete_at_kposition(2);
		list.printlist();
		System.out.println();
	}

}
