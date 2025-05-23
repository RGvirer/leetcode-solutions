class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int total =0;
        for(int i = 0; i < s.length(); i++){
            int currentVal = romanMap.get(s.charAt(i));
            int nextVal = 0;
            if(i + 1 < s.length()){
                nextVal = romanMap.get(s.charAt(i+1));
            }
            if(currentVal < nextVal){
                total -= currentVal;
            } else{
                total += currentVal;
            }
        }
        return total;
    }
}