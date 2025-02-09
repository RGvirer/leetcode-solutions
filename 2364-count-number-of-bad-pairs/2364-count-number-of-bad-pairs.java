class Solution {
    public long countBadPairs(int[] nums) {
        long cnt = 0;
        for(int i = 0; i <= nums.length; i++){
            for(int j = i + 1; j <= nums.length-1; j++){
                if(j - i != nums[j] - nums[i]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}