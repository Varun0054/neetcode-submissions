class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // There are exactly (n - k + 1) valid sliding windows
        int[] ans = new int[n - k + 1];

        // Loop over the start index of each window
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];

            // Check every element inside the current window [i ... i + k - 1]
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            // Store the maximum element found for this window
            ans[i] = max;
        }

        return ans;
    }
}