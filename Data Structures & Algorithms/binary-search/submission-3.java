class Solution {
    public int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, nums.length - 1);
    }

    private int searchHelper(int[] nums, int target, int l, int r) {
        if (l > r) return -1; // Base case

        int mid = l + (r - l) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return searchHelper(nums, target, mid + 1, r);
        } else {
            return searchHelper(nums, target, l, mid - 1);
        }
    }
}