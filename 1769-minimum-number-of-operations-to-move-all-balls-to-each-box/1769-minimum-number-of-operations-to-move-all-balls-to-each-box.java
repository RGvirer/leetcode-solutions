class Solution {
    public int[] minOperations(String boxes) {
                int n = boxes.length();
        int[] left = new int[n];  // מספר הפעולות למעבר לכיוון שמאל
        int[] right = new int[n]; // מספר הפעולות למעבר לכיוון ימין
        int[] result = new int[n]; // תשובה סופית

        // חישוב הפעולות שמאל לימין
        int leftMoves = 0, leftBalls = 0;
        for (int i = 0; i < n; i++) {
            left[i] = leftMoves;
            if (boxes.charAt(i) == '1') {
                leftBalls++;
            }
            leftMoves += leftBalls;
        }

        // חישוב הפעולות ימין לשמאל
        int rightMoves = 0, rightBalls = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = rightMoves;
            if (boxes.charAt(i) == '1') {
                rightBalls++;
            }
            rightMoves += rightBalls;
        }

        // סכום הפעולות מכל כיוון לכל קופסה
        for (int i = 0; i < n; i++) {
            result[i] = left[i] + right[i];
        }

        return result;
    }
}