class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder s1=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j < spaces.length&&i==spaces[j]){
                s1.append(" ");
                j++;
            }
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}