class Solution {
    public boolean check(int[] nums) {
        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);
        if(Arrays.equals(sortNums,nums)){
            return true;
        }
        int countBreak = 0;
        int n = nums.length - 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i + 1) % n]){
                countBreak++;
            }
        }
        return countBreak <= 1;
    }
}