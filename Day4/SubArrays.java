package Day4;

import java.util.Scanner;
public class SubArrays {

	public static void printwindow(int a[],int i,int j)
	{
		for(int k=i;k<j;k++)
		{
			System.out.print(a[k]+ " ");
		}
	}
	
	public static void slidingwindow(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				printwindow(a,i,j);
				System.out.print("\n");
			}
		}
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
		slidingwindow(a);
	}

}
