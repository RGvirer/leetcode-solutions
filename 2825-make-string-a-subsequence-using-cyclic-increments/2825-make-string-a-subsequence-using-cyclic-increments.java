class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        if(n<m){
            return false;
        }
        int p1=0,p2=0;
        while(p1<n&&p2<m){
            char c1=str1.charAt(p1);
            char c2=str2.charAt(p2);
            if(c1==c2||(c1 + 1 - 'a') % 26 + 'a' == c2){
                p2++;
            }
            p1++;
        }
        return p2==m;
    }
}