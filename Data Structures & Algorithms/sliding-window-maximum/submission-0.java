class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            for(int i =0; i < k; i++){
                if(nums[k]>i){
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}
