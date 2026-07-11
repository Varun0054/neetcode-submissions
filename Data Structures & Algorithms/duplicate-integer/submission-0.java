class Solution {
    public boolean hasDuplicate(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(num == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}