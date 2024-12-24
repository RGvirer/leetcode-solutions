class Solution {
    public int maximumCount(int[] nums) {
        int posCnt=0,negCnt=0;
        for(int num:nums){
            if(num>0){
                posCnt++;
            } else if(num<0){
                negCnt++;
            }
        }
        return Math.max(negCnt,posCnt);
    }
}