class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], currMax = nums[0];
        for(int i =1;i<nums.length;i++){
            currMax = Math.max(nums[i],nums[i]+currMax);
            maxSoFar = Math.max(currMax,maxSoFar);
        }
        return maxSoFar;
    }
}
