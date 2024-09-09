package Day6;

import java.util.Scanner;

public class MinimumSizeSubArraySum209 {

	public static int minSubArrayLen(int target, int[] nums) {
        int minl= Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                minl= Math.min(minl,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minl==Integer.MAX_VALUE?0:minl;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n:");
		int n= scan.nextInt();
		int nums[]= new int[n];
		System.out.println("Enter the target:");
		int target= scan.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
				nums[i]= scan.nextInt();
		}
		System.out.println(minSubArrayLen(target, nums));
	}

}
