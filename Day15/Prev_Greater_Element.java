package Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution
{
	public static long[] prevGreater(long[] arr, int n)
    { 
		Stack<Long> s= new Stack<>();
        long[] res= new long[n];
        for(int i=0;i<n;i++)
        {
        	while(!s.isEmpty() && s.peek() <= arr[i])
            {
        		 s.pop();
            }
        	if(s.isEmpty())
            {
        		res[i]= -1;
            }
        	else
            {
        		res[i]= s.peek();
            }
        	s.push(arr[i]);
        }
        return res;
    }
}
public class Prev_Greater_Element {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of elements:");
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = Long.parseLong(inputLine[i]);
        }
        long[] res = new Solution().prevGreater(arr, n);
        for (int i = 0; i < n; i++) 
        {
        	 System.out.print(res[i] + " ");
        }
        System.out.println();
	}

}
