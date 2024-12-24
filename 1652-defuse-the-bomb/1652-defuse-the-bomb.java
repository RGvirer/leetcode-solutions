class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    int idx = (i + j) % n;
                    sum += code[idx];
                }
                result[i] = sum;
            }
        } else if (k < 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= Math.abs(k); j++) {
                    int idx = (i - j + n) % n;
                    sum += code[idx];
                }
                result[i] = sum;
            }
        } else {
            for (int i = 0; i < n; i++) {
                result[i] = 0;
            }
        }

        return result;
    }
}
