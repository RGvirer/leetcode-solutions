class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedHashSet = new HashSet<>();
        for(int num:banned){
            bannedHashSet.add(num);
        }
        int currentSum=0;
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(bannedHashSet.contains(i)){
                continue;
            }
            if(currentSum + i > maxSum){
                break;
            }
            currentSum+=i;
            cnt++;
        }
        return cnt;
    }
}