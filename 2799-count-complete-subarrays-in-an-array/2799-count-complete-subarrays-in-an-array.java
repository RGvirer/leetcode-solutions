class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int distinctElementCnt = set.size();
        int cnt = 0;
        for(int left = 0; left < nums.length; left++){
            Set<Integer> seen = new HashSet<>();
            for(int right = left; right < nums.length; right++){
                seen.add(nums[right]);
                if(seen.size() == distinctElementCnt){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}