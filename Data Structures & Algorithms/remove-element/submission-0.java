class Solution {
    public int removeElement(int[] nums, int val) {

        // [1,2,3,2,3], 3
        // [1,2,2,2,3]
        // [1,2,2,_], 3
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(nums[i] == val){
                for(int k = i+1; k< length; k++){
                    nums[k-1] = nums[k];
                }
                
                length--;
                i--;
            }
        }
        return length;
    }
}