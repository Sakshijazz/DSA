package Day14;

import java.util.Scanner;

public class LinkedListCycle_141 {

	public static boolean cycle(ListNode head)
	{
		if(head == null)
		{
			return false;
		}
		ListNode slow= head;
		ListNode fast= head;
		while(fast != null && fast.next != null)
		{
			slow= slow.next;
			fast= fast.next.next;
			if(slow == fast)
			{
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next=head;
       
        boolean iscycle = cycle(head);
        System.out.print(iscycle);
	}

}
