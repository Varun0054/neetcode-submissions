class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xsum =0;
        int tsum =0;
        int missingNumber = 0;
        for(int i =0; i < n; i++){
            xsum = xsum ^ i;
            tsum = tsum ^ nums[i];
        }
        missingNumber =  xsum^tsum^n;

        return missingNumber;
    }
}