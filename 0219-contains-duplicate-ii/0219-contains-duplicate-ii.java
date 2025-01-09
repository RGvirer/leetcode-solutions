class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int right=1,left=0;
        while(left<nums.length){
            if(right<nums.length && nums[left]==nums[right]){
                if(Math.abs(left-right)<=k){
                    return true;
                }
            }
            if(right<nums.length-1){
                right++;
            } else{
                left++;
                right=left+1;
            }
        }
        return false;
    }
}