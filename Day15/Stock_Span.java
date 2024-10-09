package Day15;

import java.util.Scanner;
import java.util.Stack;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
    	this.val = val;
        this.idx = idx;
    }
}

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
        	a[i] = input.nextInt();
        }
        Main s  = new Main();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
	}

}

class Main
{
	static int[] stockSpan(int[] arr) {
        Stack<Integer> s= new Stack<>();
        int span[]= new int[arr.length];
        s.push(0);
        span[0]= 1;
        for(int i=1;i<arr.length;i++)
        {
        	while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
        		 s.pop();
            }
        	if(s.isEmpty())
            {
        		span[i]= i+1;
            }
        	else
            {
        		span[i]= i-s.peek();
            }
        	s.push(i);
        }
        return span;
}
}
