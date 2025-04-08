class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        while(!isDistinct(nums)){
            nums = nums.length <= 3 ? new int[0] : Arrays.copyOfRange(nums, 3, nums.length);
            operations++;
        }
        return operations;
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