package Day7;

import java.util.Scanner;

public class Threshold1343 {

	public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        double sum=0;
        for(int left=0, right=0; right<arr.length;right++)
        {
            sum+= arr[right];
            if(right>= k-1)
            {
                if(sum/k >= threshold)
                {
                    count++;
                }
                sum-= arr[left++];
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter k:");
		int k= scan.nextInt();
		System.out.println("Enter threshold:");
		int threshold= scan.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
				arr[i]= scan.nextInt();
		}
		System.out.println(numOfSubarrays(arr, k, threshold));
	}

}
