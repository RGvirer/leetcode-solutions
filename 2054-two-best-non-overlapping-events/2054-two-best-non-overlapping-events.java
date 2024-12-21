class Solution {
    public int maxTwoEvents(int[][] events) {
        // מיון האירועים לפי זמן הסיום
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        int n = events.length;
        int[] maxValues = new int[n];
        maxValues[0] = events[0][2];
        
        // חישוב הערך המקסימלי עד לכל אירוע
        for (int i = 1; i < n; i++) {
            maxValues[i] = Math.max(maxValues[i - 1], events[i][2]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            // מקסימום עם אירוע בודד
            result = Math.max(result, events[i][2]);
            
            // חיפוש בינארי לאירוע הקודם שאינו חופף
            int left = 0, right = i - 1, bestIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < events[i][0]) {
                    bestIndex = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            // אם נמצא אירוע קודם שאינו חופף, נחשב את הסכום
            if (bestIndex != -1) {
                result = Math.max(result, events[i][2] + maxValues[bestIndex]);
            }
        }
        
        return result;
    }
}