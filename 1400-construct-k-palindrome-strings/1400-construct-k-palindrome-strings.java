class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false; // אי אפשר לבנות יותר פעלינדרומים ממספר התווים
        }

        // מערך לספירת תדירות התווים (עבור a-z)
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // ספירת תווים בעלי תדירות אי-זוגית
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // ניתן לבנות k פעלינדרומים אם מספר התווים האי-זוגיים קטן או שווה ל-k
        return oddCount <= k;
    }
}