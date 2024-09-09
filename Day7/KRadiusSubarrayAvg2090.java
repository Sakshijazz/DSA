package Day7;

import java.util.Scanner;

public class KRadiusSubarrayAvg2090 {

	public static int[] getAverages(int[] nums, int k) {
        int avg[]= new int [nums.length];
        int a= 2*k-1;
        double sum=0;
        for(int i=0;i<k&&i<nums.length;i++)
        {
            sum+= nums[i];
            avg[i]=-1;
        }
        for(int i=k;i<(2*k+1)&&i<nums.length;i++)
        {
            sum+=nums[i];
            if(i==(2*k))
            {
                avg[k]=(int)(sum/(2*k+1));
            }
        }
            for(int i=(2*k+1);i<nums.length;i++)
            {
                sum+=nums[i];
                sum-= nums[i-(2*k+1)];
                avg[i-k]= (int)(sum/(2*k+1));
            }
            for(int i=nums.length-k;i>=0&&i<nums.length;i++)
            {
                avg[i]=-1;
            }
        return avg;

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
		System.out.println(getAverages(nums, k));
	}

}
