class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int zerosLeft = 0;
        int onesRight = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                onesRight++;
            }
        }
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zerosLeft++;
            }
            else{
                onesRight--;
            }
            int score = onesRight + zerosLeft;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}