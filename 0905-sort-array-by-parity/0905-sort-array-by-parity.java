class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;//זוגי
        int right=nums.length-1;//אי זוגי
        while(left<right){
            if(nums[left]%2!=0&&nums[right]%2==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
            if(nums[left]%2==0){
                left++;
            }
            if(nums[right]%2!=0){
                right--;
            }
        }
        return nums;
    }
}