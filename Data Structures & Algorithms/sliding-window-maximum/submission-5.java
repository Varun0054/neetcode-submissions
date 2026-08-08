class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int max = nums[i];
            for(int j=0; j < k; j++){
                if(nums[j]>i){
                    ans[i] = nums[j];
                }
            }
        }
        return ans;
    }
}
