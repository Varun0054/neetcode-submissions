class Solution {
    public int removeElement(int[] nums, int val) {
        // for(int i = 0; i < nums.length;i++){

        // }
       
        int k =0,i=0;
        while(i < nums.length){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;      
            }
            i++;
        }
        return k;
    }
}