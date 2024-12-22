class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0,i;
        for(i=num/2;i>=1;i--){
            if(num%i==0){
                sum+=i;

            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}