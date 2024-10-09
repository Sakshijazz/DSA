package Day14;

import java.util.Scanner;

public class Add_2_Num_LL 
{
	public static void main(String args[]) 
	{
	
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = input.nextInt();
        LL a = new LL();
        System.out.println("Enter the no. of elements:");
        for (int i = 0; i < n; i++) 
        {
            a.add(input.nextInt());
        }
        
        System.out.println("Enter the no. of elements:");
        int m = input.nextInt();
        LL b = new LL();
        System.out.println("Enter the no. of elements:");
        for (int j = 0; j < m; j++) 
        {
            b.add(input.nextInt());
        }
        
        LL ans = new LL();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.reverse(); 
        ans.printList();
	}
}
        class node 
        {
            int data;
            node next;
            node(int data) 
            {
            	this.data = data;
                this.next = null;
            }
        }
        class LL
        {
        	node head;
            void add(int data) 
            {
            	node newNode = new node(data);
                newNode.next = head;
                head = newNode;
            }
        
            void printList() 
            {
            	node temp = head;
                while (temp != null) 
                {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
            void reverse() 
            {
            	node prev = null;
            	node current = head;
            	node next = null;
                while (current != null) 
                {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
                head = prev;
            }
        }
        
class Solution
{
	public static node addTwoLinkedLists(node head1, node head2) 
	{
        Scanner input = new Scanner(System.in);
        node sh= new node(0);
	     int carry= 0;
	     node curr=sh;
	     while(head1 != null || head2 != null || carry != 0)
	     {
	    	 int sum= (head1== null ? 0: head1.data) + (head2== null? 0: head2.data) + carry;
	         carry= sum/10;
	         curr.next= new node(sum%10);
	         curr= curr.next;
	         head1= head1== null? null:head1.next;
	         head2= head2== null? null:head2.next;
	      }
	      return sh.next;
	}
}
