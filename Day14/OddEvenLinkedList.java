package Day14;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class OddEvenLinkedList {

	public static ListNode rearrangeEvenOdd(ListNode head) {
        if (head == null || head.next == null) {
            return head;  
        }
        ListNode evenHead = head.next; 
        ListNode odd = head;           
        ListNode even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;  
            odd = odd.next;       
            even.next = odd.next;
            even = even.next;      
        }
        odd.next = evenHead;  
        return head; 
	}
	
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ListNode head = new ListNode(1);
		        head.next = new ListNode(2);
		        head.next.next = new ListNode(3);
		        head.next.next.next = new ListNode(4);
		        head.next.next.next.next = new ListNode(5);
		        head.next.next.next.next.next = new ListNode(6);

		        ListNode newHead = rearrangeEvenOdd(head);
		        printList(newHead);  
		    }
		
	}





