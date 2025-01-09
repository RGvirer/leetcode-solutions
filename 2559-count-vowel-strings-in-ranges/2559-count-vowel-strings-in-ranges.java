class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        // Define vowels as a simple boolean array for quick lookup
        boolean[] vowels = new boolean[128];
        vowels['a'] = true; vowels['e'] = true; vowels['i'] = true; vowels['o'] = true; vowels['u'] = true;

        int n = words.length;

        // Step 1: Compute prefix sum inline
        int[] prefixSum = new int[n];
        prefixSum[0] = (isVowel(words[0], vowels)) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (isVowel(words[i], vowels) ? 1 : 0);
        }

        // Step 2: Answer each query
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri] - (li > 0 ? prefixSum[li - 1] : 0);
        }

        return result;
    }

    private boolean isVowel(String word, boolean[] vowels) {
        return vowels[word.charAt(0)] && vowels[word.charAt(word.length() - 1)];
    }
}
