package Day4;

import java.util.Scanner;

public class Maxsubarray {

	public static int max(int[] a)
	{
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
            max = Math.max(sum, max);
            if(sum < 0)
            {
            	sum = 0;
            }
         }
        System.out.println("Max:"+max);
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n= scan.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the array1:");
		for(int i=0;i<n;i++)
		{
			a[i]= scan.nextInt();
		} 
		max(a);
	}

}
