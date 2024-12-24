class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCnt=0;
        int index=0;
        int current=1;
        while(true){
            if(index<arr.length&&arr[index]==current){
                index++;
            }
            else{
                missingCnt++;
                if(missingCnt==k){
                    return current;
                }
            }
            current++;
        }
    }
}