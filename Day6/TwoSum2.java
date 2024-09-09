package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum2 {

	public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> idx= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int current= nums[i];
            int difference= target-current;
            if(idx.containsKey(difference))
            {
                return new int[]
                {
                    idx.get(difference),i
                };
            }
            idx.put(current,i);
        }
        return new int[2];
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
		System.out.println(twoSum(nums, k));
	}

}
