class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            if(key==value&&key>max){
                max=key;
            }
        }
        return max;
    }
}