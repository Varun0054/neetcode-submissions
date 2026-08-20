   class Solution {
    public int findDuplicate(int[] nums) {
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s = nums[i];
            for(int j =  i + 1; j < nums.length; j++){
                if(s == nums[j]){
                    return s;
                }
            }
        }
        return -1;
    }

}