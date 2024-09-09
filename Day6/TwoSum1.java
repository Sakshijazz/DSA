package Day6;

	import java.util.Arrays;

	public class TwoSum1 {
	    public static int[] twoSum(int[] nums, int target) {
	        
	        Arrays.sort(nums);
	        
	        int left = 0;
	        int right = nums.length - 1;
	       
	        while (left < right) 
	        {
	            int sum = nums[left] + nums[right];
	            
	            if (sum == target) 
	            {
	                return index(nums, nums[left], nums[right]);
	            } 
	            else if (sum < target)
	            {
	                left++;
	            } 
	            else 
	            {
	                right--;
	            }
	        }
			return nums;
	    }

	    private static int[] index(int[] nums, int num1, int num2) {
	        int idx1 = -1;
	        int idx2 = -1;
	        
	        for (int i = 0; i < nums.length; i++) 
	        {
	            if (nums[i] == num1) 
	            {
	                idx1 = i;
	            } 
	            else if (nums[i] == num2) 
	            {
	                idx2 = i;
	            }
	        }
	        
	        if (idx1 != -1 && idx2 != -1) {
	            return new int[] { idx1, idx2 };
	        }
			return nums;
	    }

	    public static void main(String[] args) {
	       
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = twoSum(nums, target);
	        
	        System.out.println( result[0] + ", " + result[1]);
	    }
	}
