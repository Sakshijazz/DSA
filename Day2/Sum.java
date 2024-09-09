package Day2;

import java.util.Scanner;

public class Sum {
	public static int[] insert(int arr[], int element) {
		
	int [] brr= new int[arr.length+1];
	brr[0]= element;
	for(int i=0;i<arr.length;i++)
	{
		brr[i+1]=arr[i];
	}

	return brr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no. of array:");
		int x= scan.nextInt();
		int arr1[] = new int [x];
		System.out.println("Enter the array1:");
		for(int i=0;i<x;i++)
		{
			arr1[i]= scan.nextInt();
		}
		System.out.println("Enter the no. of array:");
		int y= scan.nextInt();
		int arr2[] = new int [y];
		System.out.println("Enter the array2:");
		for(int i=0;i<y;i++)
		{
			arr2[i]= scan.nextInt();
		}
		
		int sum[]= new int[arr1.length];
		int i=x-1;
		int j=y-1;
		int k=x-1;
		int s=0, c=0;
		while(j>=0)
		{
			s=arr1[i]+arr2[j]+c;
			sum[k]=s%10;
			c=s/10;
			i--;
			j--;
			k--;
		}
		while(i>=0)
		{
			s=arr1[i]+c;
			sum[k]=s%10;
			c=s/10;
			i--;
			k--;
		}
		if(c!=0)
		{
			sum=insert(sum,c);
		}
		for(int m:sum)
		{
			System.out.print(m+" ");
		}
	}

}
