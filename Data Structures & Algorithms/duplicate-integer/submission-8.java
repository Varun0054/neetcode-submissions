class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}