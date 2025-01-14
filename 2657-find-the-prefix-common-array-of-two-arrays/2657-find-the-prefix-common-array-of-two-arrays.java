class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> seenA = new HashSet<>();
        Set<Integer> seenB = new HashSet<>();
        int[] C = new int[A.length];

        for(int i=0;i < A.length;i++){
            seenA.add(A[i]);
            seenB.add(B[i]);

            int commonCount = 0;
            for (Integer val : seenA) {
                if (seenB.contains(val)) {
                    commonCount++;
                }
            }

            C[i] = commonCount;
        }
        return C;
    }
}