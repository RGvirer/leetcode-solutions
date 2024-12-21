class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int l1=nums1.length-1;
        int l2=nums2.length-1;
        int i = arr.length - 1;
        while(l1>=0 && l2>=0){
            if(nums1[l1]<nums2[l2]){
                arr[i--]=nums2[l2--];
            } else{
                arr[i--]=nums1[l1--];
            }
        }
        while(l1>=0){
            arr[i--]=nums1[l1--];
        }
        while(l2>=0){
            arr[i--]=nums2[l2--];
        }
        int l=arr.length;
        if(l%2==1){
            return arr[l/2];
        } else{
            return (arr[l/2]+arr[l/2-1])/2.0;
        }
    }
}