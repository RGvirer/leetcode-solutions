class Solution {
    public int[] getNoZeroIntegers(int n) {
        int left=1,right=n-1;
        while(left<=right){
            if(isNoZeroInt(left)==true&&isNoZeroInt(right)==true){
                return new int[] {left, right};
            }
            else{
                left++;
                right--;
            }
        }
        return  new int[] {0,0};
    }
    public boolean isNoZeroInt(int num){
        while(num>0){
            int digit=num%10;
            if(digit==0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}