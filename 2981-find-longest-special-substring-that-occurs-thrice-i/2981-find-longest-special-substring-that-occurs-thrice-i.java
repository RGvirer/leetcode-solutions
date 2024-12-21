class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int left = 1, right = n;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (hasSpecialSubstringOfLength(s, mid)) {
                result = mid; // Update result to the current valid length
                left = mid + 1; // Try for a longer length
            } else {
                right = mid - 1; // Try for a shorter length
            }
        }

        return result;
    }

    private static boolean hasSpecialSubstringOfLength(String s, int length) {
        Map<String, Integer> substringCount = new HashMap<>();

        for (int i = 0; i <= s.length() - length; i++) {
            String substring = s.substring(i, i + length);
            if (isSpecial(substring)) {
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
            }
        }

        for (int count : substringCount.values()) {
            if (count >= 3) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }
}