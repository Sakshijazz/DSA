package Day4;

import java.util.Scanner;

public class Container {

	public static int container(int a[])
	{
		int maxA=0;
		int left=0;
		int right= a.length-1;
		while(left<right)
		{
			maxA= Math.max(maxA, (right-left)* Math.min(a[left],a[right]));
			if(a[left]<a[right]) 
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		return maxA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n= scan.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]= scan.nextInt();
		}
		System.out.println(container(a));
		
	}

}
