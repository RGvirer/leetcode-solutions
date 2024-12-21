class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
           return false;
        }
        int length=0;
        int temp=x;
        //מציאת מספר הספרות בקלט
        while(temp!=0){
            length++;
            temp/=10;
        }
        int[] arr=new int[length];
        //הכנסת המספר למערך
        while(x/10!=0){
            for(int i=0;i<arr.length;i++){
                arr[i]=x%10;
                x/=10;
            }
        }
        //מעבר על המערך ובדיקה אם הןוא פלינדרום
        for(int i=0;i<arr.length/2;i++){
             if (arr[i] != arr[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}