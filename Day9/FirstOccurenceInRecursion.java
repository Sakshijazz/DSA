package Day9;

import java.util.Scanner;

public class FirstOccurenceInRecursion {

	public static int occurence(int arr[], int Occur, int i)
	{
		if(arr.length == i)
		{
			return -1;
		}
		if(arr[i] == Occur)
		{
			return i;
		}
		return occurence(arr, Occur, i+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n= scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter elements:");
		for(int i1=0;i1<n;i1++)
		{
			arr[i1]= scan.nextInt();
		}
		System.out.println("Enter target:");
		int Occur= scan.nextInt();
		int idx= occurence(arr,Occur, 0);
		if(idx == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index :"+ idx);

		}
	}

}
