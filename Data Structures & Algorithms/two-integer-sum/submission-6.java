class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hs = new HashMap<>();
        int current =0, needed =0;
        for(int i =0; i < nums.length; i++){
            current = nums[i];
            needed = target - current;
            if(hs.containsKey(needed)){
                return new int[] {hs.get(needed),i};
            }
            hs.put(current,i);
        }
        return new int[]{};
    }
}
