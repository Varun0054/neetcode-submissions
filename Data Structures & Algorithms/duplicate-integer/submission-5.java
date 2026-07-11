class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (int element : nums) {
            if (!hs.add(element)) {
                return true;
            }
        }

        return false;
    }
}