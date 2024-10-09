package Day14;

import java.util.Scanner;

public class Merge_2_sorted_LL_21 {

	public LNode mergeTwoLists(LNode list1, LNode list2) {
        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
	static void printlist(LNode head)
	{
		LNode temp= head;
		while(temp!= null)
		{
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n= scan.nextInt();
		LinkedList llist1= new LinkedList();
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		{
			int data= scan.nextInt();
			llist1.push(new LNode(data));
		}
		System.out.println("Enter the no. of elements:");
		int m= scan.nextInt();
		LinkedList llist2= new LinkedList();
		System.out.println("Enter the elements:");
		for(int i=0; i<m; i++)
		{
			int data= scan.nextInt();
			llist2.push(new LNode(data));
		}
		Merge_2_sorted_LL_21 obj= new Merge_2_sorted_LL_21();
		LNode sortedHead = obj.mergeTwoLists(llist1.head, llist2.head);
		printlist(sortedHead);
		
	}

}
