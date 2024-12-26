class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return calculateWays(nums, target, 0, 0);
    }

    private int calculateWays(int[] nums, int target, int index, int currentSum) {
        // בסיס עצירה: כאשר מגיעים לסוף המערך
        if (index == nums.length) {
            return currentSum == target ? 1 : 0;
        }

        // חישוב עבור שני האפשרויות: הוספת "+" או "-"
        int add = calculateWays(nums, target, index + 1, currentSum + nums[index]);
        int subtract = calculateWays(nums, target, index + 1, currentSum - nums[index]);

        // חזרה של סכום האפשרויות
        return add + subtract;
    }
}