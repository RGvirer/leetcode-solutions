class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<String> uniquePalindromes = new HashSet<>();

        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (first[c - 'a'] == -1) {
                first[c - 'a'] = i;
            }
            last[c - 'a'] = i;
        }

        for (int ch = 0; ch < 26; ch++) {
            if (first[ch] != -1 && last[ch] != -1 && first[ch] < last[ch]) {
                Set<Character> middleCharacters = new HashSet<>();
                for (int i = first[ch] + 1; i < last[ch]; i++) {
                    middleCharacters.add(s.charAt(i));
                }
                for (char middle : middleCharacters) {
                    uniquePalindromes.add("" + (char) (ch + 'a') + middle + (char) (ch + 'a'));
                }
            }
        }

        return uniquePalindromes.size();
    }
}