class Solution {
    public int[] sortedSquares(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            m = nums[i];
            nums[i] *= m;
            // if(nums[i] < nums[i+1]){
            //     int temp = nums[i];
            //     nums[i] = nums[i+1];
            //     nums[i+1] = temp;
            // }
        }
        Arrays.sort(nums);

        return nums;
    }
}