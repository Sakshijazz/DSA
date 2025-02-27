//LeetCode Solution
//LeetCode 1
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> idx=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int diff=target-cur;
            if(idx.containsKey(diff)){
                return new int[]{idx.get(diff),i};
            }
            idx.put(cur,i);
        }
        return new int[2];
    }
}
