class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int length = 0;
        int maxlength = 0;
        Set<Integer> set = new HashSet<>();
        int current = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                current = num;
                length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxlength = Math.max(maxlength, length);
            }
        }
        return maxlength;
    }
}
