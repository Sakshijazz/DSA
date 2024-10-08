package Day13;

class ListNode
{
	 int val;
	 ListNode next;
	 ListNode() 
	 {
		 
	 }
	 ListNode(int val) 
	 { 
		 this.val = val; 
	 }
	 ListNode(int val, ListNode next) 
	 { 
		 this.val = val; this.next = next; 
	 }
}

public class LL_Palindrome {

	public static boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head, fast = head;

        while (fast.next != null 
               && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverseList1(slow.next);
        slow.next = null;

        boolean ret = isIdentical1(head, head2);

        head2 = reverseList1(head2);
        slow.next = head2;

        return ret;
    }
    static ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static boolean isIdentical1(ListNode n1, ListNode n2) {
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
		
        boolean newHead = isPalindrome1(head);
        System.out.print(newHead); 
	}
}
