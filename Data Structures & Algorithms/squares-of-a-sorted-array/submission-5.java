class Solution {
    public int[] sortedSquares(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            m = nums[i];
            nums[i] *= m;
        }
        Arrays.sort(nums);

        return nums;
    }
}