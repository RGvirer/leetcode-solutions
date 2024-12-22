class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            int num=i;
            boolean isDividing=true;

            while(num>0){
                int digit=num%10;
                if(digit==0||i%digit!=0){
                    isDividing=false;
                    break;
                }
                num/=10;
            }
            if(isDividing){
                result.add(i);            
            }
        }
        return result;
    }
}