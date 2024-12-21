class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> result =  new HashSet<>();
        for(int num:nums1){
            hashSet.add(num);
        }
        for(int num:nums2){
            if(hashSet.contains(num)){
                result.add(num);
            }
        }
        int[] array = new int[result.size()];
        int index = 0;
        for (int num : result) {
            array[index++] = num;
        }
        return array;
    }
}