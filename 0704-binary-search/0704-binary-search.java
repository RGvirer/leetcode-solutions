class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return -1;
    }
}