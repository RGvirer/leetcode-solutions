class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=Integer.MAX_VALUE;
        int sumClosest=0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                int difference=Math.abs(sum-target);
                if(difference<closest){
                    closest=difference;
                    sumClosest=sum;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return sumClosest;
    }
}