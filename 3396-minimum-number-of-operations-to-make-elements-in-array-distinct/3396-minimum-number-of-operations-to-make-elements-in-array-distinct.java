class Solution {
    public int minimumOperations(int[] nums) {
        if(isDistinct(nums)){
            return 0;
        }
        int[] trimmed = nums.length <= 3 ? new int[0] : Arrays.copyOfRange(nums, 3, nums.length);
        return 1 + minimumOperations(trimmed);
    }
    private boolean isDistinct(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return false;
            }
        }
            return true;
    }
}