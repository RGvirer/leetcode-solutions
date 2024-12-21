class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] isSpecial = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] % 2) != (nums[i + 1] % 2)) {
                isSpecial[i] = 1;
            }
        }

        int[] prefixSum = new int[n];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + isSpecial[i - 1];
        }

        boolean[] result = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            int countSpecialPairs = prefixSum[to] - prefixSum[from];
            result[i] = (countSpecialPairs == (to - from));
        }

        return result;
    }
}