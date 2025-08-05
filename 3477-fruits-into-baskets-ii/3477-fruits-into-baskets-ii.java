class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = fruits.length;
        for(int fruit : fruits){
            for(int i = 0; i < baskets.length; i++){
                if(fruit <= baskets[i]){
                    cnt--;
                    baskets[i] = 0;
                    break;
                }
            }
        }
        return cnt;
    }
}