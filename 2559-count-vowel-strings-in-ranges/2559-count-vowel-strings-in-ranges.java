class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n = words.length;
        
        // Step 1: Classify words that start and end with vowels
        int[] isVowel = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (vowels.contains(first) && vowels.contains(last)) {
                isVowel[i] = 1;
            }
        }
        
        // Step 2: Compute prefix sum
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + isVowel[i];
        }
        
        // Step 3: Answer queries
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }
        
        return result;
    }
}