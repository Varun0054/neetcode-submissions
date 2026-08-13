class Solution {
    public int[] singleNumber(int[] nums) {
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            x = x ^ nums[i];
        }

        int bit = x & -x;
        int a = 0, b = 0;

        for (int num : nums) {
            if ((num & bit) != 0) {
                a = a ^ num;
            } else {
                b = b ^ num;
            }
        }
        return new int[] {a, b};
    }
}