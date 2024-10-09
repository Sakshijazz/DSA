package Day15;

import java.util.Stack;

public class Next_Greater_Stack {

	public static long[] NGE(long arr[], int n)
	{
		long [] sol= new long[n];
		int i=0;
		Stack<Long> s= new Stack<>();
		long element, next;
		
		s.push(arr[0]);
		for(i=1;i<n;i++)
		{
			next= arr[i];
			if(s.isEmpty() == false)
			{
				element= s.pop();
				while(element< next)
				{
					sol[i]= next;
					if(s.isEmpty() == true)
					{
						break;
					}
					element= s.pop();
				}
				if(element> next)
				{
					s.push(element);
				}
			}
			s.push(next);
		}
		while(s.isEmpty() == false)
		{
			s.pop();
			sol[i-2]= -1;
			i++;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
