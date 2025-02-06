class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, List<int[]>> hash = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int product = nums[i] * nums[j]; 
                hash.putIfAbsent(product,new ArrayList<>());
                hash.get(product).add(new int[]{nums[i], nums[j]});
            }
        }

        for(List<int[]> pairs : hash.values()){
            int k = pairs.size();
            if (k > 1) {
                count += (k * (k - 1)) * 4;
            }
        }
        return count;
    }
}