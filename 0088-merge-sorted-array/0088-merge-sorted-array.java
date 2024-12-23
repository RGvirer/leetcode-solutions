class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex=m+n-1;
        while(n>0&&m>0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[lastIndex]=nums2[n-1];
                n--;
            }
            else{
                nums1[lastIndex]=nums1[m-1];
                m--;
            }
            lastIndex--;
        }
        while (n > 0) {
            nums1[lastIndex] = nums2[n - 1];
            n--;
            lastIndex--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}