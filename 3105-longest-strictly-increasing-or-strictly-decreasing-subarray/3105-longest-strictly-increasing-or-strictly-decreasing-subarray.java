class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int incLength = 1;
        int decLength = 1;
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) { // עלייה מחמירה
                incLength++;
                decLength = 1;
            } else if (nums[i] < nums[i - 1]) { // ירידה מחמירה
                decLength++;
                incLength = 1;
            } else {
                incLength = 1;
                decLength = 1;
            }
            
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        return maxLength;
    }
}