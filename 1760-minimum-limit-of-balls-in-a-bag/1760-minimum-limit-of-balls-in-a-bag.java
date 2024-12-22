class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        
        // חישוב הערך המקסימלי בשקית
        for (int num : nums) {
            right = Math.max(right, num);
        }

        // חיפוש בינארי למציאת העונש המינימלי האפשרי
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                right = mid; // ניתן להגיע לתוצאה טובה יותר
            } else {
                left = mid + 1; // צריך להגדיל את העונש
            }
        }

        return left;
    }

    private boolean canDivide(int[] nums, int maxOperations, int maxBalls) {
        int operations = 0;
        
        for (int num : nums) {
            // חישוב מספר החלקים הדרושים על מנת שכל שקית תכיל לכל היותר maxBalls כדורים
            operations += (num - 1) / maxBalls;
            if (operations > maxOperations) {
                return false; // יותר מדי פעולות נדרשות
            }
        }

        return true;
    }
}