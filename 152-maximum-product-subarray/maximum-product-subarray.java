class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxP = nums[0];
        int minP = nums[0];
        int result = nums[0];
        for (int i=1; i<n; i++){
            int temp = maxP;
            maxP = Math.max(nums[i], Math.max(nums[i]*maxP, nums[i]*minP));
            minP = Math.min(nums[i], Math.min(nums[i]*temp, nums[i]*minP));
            result = Math.max(result, maxP);
        }
        return result;
    }
}