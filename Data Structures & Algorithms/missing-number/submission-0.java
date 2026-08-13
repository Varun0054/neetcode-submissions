class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0, tsum = 0;
        int missingNum = 0;
        for (int i = 0; i < n; i++) {
            tsum += nums[i];
            sum = n * (n + 1) / 2;
            missingNum = sum - tsum;
        }
        return missingNum;
    }
}