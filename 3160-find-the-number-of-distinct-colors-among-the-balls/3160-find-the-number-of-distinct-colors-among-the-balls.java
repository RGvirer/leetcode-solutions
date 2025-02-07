class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColors = new HashMap<>(); // כדור -> צבע
        Map<Integer, Integer> colorCount = new HashMap<>(); // צבע -> כמות הופעות
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // אם לכדור יש צבע קודם, נעדכן את הספירה
            if (ballColors.containsKey(ball)) {
                int oldColor = ballColors.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            // עדכון צבע הכדור
            ballColors.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            // מספר הצבעים הייחודיים כרגע
            result[i] = colorCount.size();
        }
        return result;
    }
}