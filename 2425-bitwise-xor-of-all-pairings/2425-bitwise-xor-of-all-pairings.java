class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;

        // חישוב XOR לכל איברי nums1
        for (int num : nums1) {
            xor1 ^= num;
        }

        // חישוב XOR לכל איברי nums2
        for (int num : nums2) {
            xor2 ^= num;
        }

        // אם nums2.length אי-זוגי, כל איבר ב-nums1 יופיע במספר אי-זוגי של פעמים ולכן נשתמש ב-xor1
        // אם nums1.length אי-זוגי, כל איבר ב-nums2 יופיע במספר אי-זוגי של פעמים ולכן נשתמש ב-xor2
        return (nums2.length % 2 == 0 ? 0 : xor1) ^ (nums1.length % 2 == 0 ? 0 : xor2);
    }
}