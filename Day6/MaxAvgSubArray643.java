package Day6;

import java.util.Scanner;

public class MaxAvgSubArray643 {

	public static double findMaxAverage(int[] nums, int k) {
        int a=0;
        double sum=0;
        double max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(i>=k-1)
            {
                if(sum/k>max){
                    max= sum/k;
                }
                sum-= nums[a];
                    a++;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		int nums[]= new int[n];
		System.out.println("Enter the target:");
		int k= scan.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
				nums[i]= scan.nextInt();
		}
		System.out.println(findMaxAverage(nums, k));
	}

}
