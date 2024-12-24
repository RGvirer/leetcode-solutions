class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hush1=new HashSet<>();
        HashSet<Integer> hush2=new HashSet<>();
        for(int num1:nums1){
            hush1.add(num1);
        }
        for(int num2:nums2){
            hush2.add(num2);
        }
        List<Integer> unique1=new ArrayList();
        for(int num:hush1){
            if (!hush2.contains(num)){
                unique1.add(num);
            }
        }
        List<Integer> unique2=new ArrayList();
        for(int num:hush2){
            if(!hush1.contains(num)){
                unique2.add(num);
            }
        }
        List<List<Integer>> result=new ArrayList();
        result.add(unique1);
        result.add(unique2);
        return result;
    }
}