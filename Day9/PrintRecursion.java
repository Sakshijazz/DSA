package Day9;

import java.util.Scanner;

public class PrintRecursion {

	public static void printRec(int arr[], int i)
	{
		if(arr.length == i)
		{
			return;
		}
		System.out.print(arr[i]+" ");
		printRec(arr,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n= scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i1=0;i1<n;i1++)
		{
			arr[i1]= scan.nextInt();
		}
		printRec(arr, 0);
	}

}
