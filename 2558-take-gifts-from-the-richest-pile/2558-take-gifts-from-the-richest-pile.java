class Solution {
    public long pickGifts(int[] gifts, int k) {
        // ערימת מקסימום באמצעות PriorityQueue
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        for (int gift : gifts) {
            maxHeap.add((long) gift); // טיפול במספרים גדולים
        }

        // חזרה על הפעולה k פעמים
        for (int i = 0; i < k; i++) {
            if (maxHeap.isEmpty()) break; // אם הערימה ריקה, עצור
            long maxGifts = maxHeap.poll(); // מוציא את הערך הגדול ביותר
            long remaining = (long) Math.floor(Math.sqrt(maxGifts)); // מחשב את השורש הריבועי
            maxHeap.add(remaining); // מוסיף את השארית חזרה לערימה
        }

        // חישוב הסכום של כל הערכים שנותרו
        long totalRemainingGifts = 0;
        while (!maxHeap.isEmpty()) {
            totalRemainingGifts += maxHeap.poll();
        }

        return totalRemainingGifts;
    }
}