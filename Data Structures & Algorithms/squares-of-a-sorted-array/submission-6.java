class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int leftsq = 0, rightsq = 0;
        int ans[] = new int[nums.length];
        int pos = nums.length - 1;;
        while (left <= right) {

            leftsq = nums[left] * nums[left];
            rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                ans[pos] = leftsq; 
                left++;
            } else {
                ans[pos] = rightsq;
                right--;
            }
            pos--;
        }
        return ans;
    }
}