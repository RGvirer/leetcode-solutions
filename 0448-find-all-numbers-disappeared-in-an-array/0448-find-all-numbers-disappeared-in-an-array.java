class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}