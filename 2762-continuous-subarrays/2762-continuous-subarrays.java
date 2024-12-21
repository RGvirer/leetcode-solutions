class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long totalCount = 0; // To store the number of valid subarrays
        int left = 0; // Left pointer for the sliding window
        
        // TreeMap to keep track of the frequency of elements in the current window
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int right = 0; right < n; right++) {
            // Add nums[right] to the map
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            // Ensure the window is valid by checking the max and min element difference
            while (map.lastKey() - map.firstKey() > 2) {
                // If invalid, shrink the window by moving the left pointer
                int leftValue = nums[left];
                map.put(leftValue, map.get(leftValue) - 1);
                if (map.get(leftValue) == 0) {
                    map.remove(leftValue);
                }
                left++;
            }
            
            // All subarrays that end at 'right' and start anywhere from 'left' to 'right' are valid
            totalCount += (right - left + 1);
        }

        return totalCount;
    }
}