class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distance=0;

        for(int num:arr1){
            int left=num-d;
            int right=num+d;
            boolean isValid = true;

            int low=0,high=arr2.length-1;
            while (low<=high) {
                int mid=low+(high-low)/2;
                if (arr2[mid]>=left && arr2[mid]<=right) {
                    isValid=false;
                    break;
                } else if(arr2[mid]<left) {
                    low=mid+1;
                } else{
                    high=mid-1;
                }
            }
            if(isValid) {
                distance++;
            }
        }
        return distance;
    }
}