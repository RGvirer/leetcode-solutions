class Solution {
    public boolean isPalindrome(String s) {
        String cleanS = convertAndRemove(s);
        int left = 0;
        int right = cleanS.length() - 1;
        while(left < right){
            if(cleanS.charAt(left) != cleanS.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    private String convertAndRemove(String s){
        StringBuilder cleaner = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaner.append(Character.toLowerCase(c));
            }
        }
        return cleaner.toString();
    }
}