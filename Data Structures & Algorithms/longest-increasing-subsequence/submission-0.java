class Solution {
    private int[] memo;

    public int lengthOfLIS(int[] nums) {
        // initialize memo
        int n = nums.length; memo = new int[n];
        for (int i=0; i<n;i++) {memo[i]=-1;}

        // call dfs for each index
        int maxLIS = 1;
        for (int i=0; i<n; i++){
            maxLIS = Math.max(maxLIS, dfs(i, nums));
        }
        return maxLIS;
    }

    public int dfs(int i, int[] nums){
        // check cache
        if (memo[i] != -1) {return memo[i];} // return cache at index i

        int LIS =1;
        for (int j=i+1; j< nums.length; j++){ // start from index after i
            if (nums[i]<nums[j]){ // check if strictly increasing
                LIS = Math.max(LIS, 1 + dfs(j, nums)); // consider next number
            }
        }
        memo[i] = LIS;
        return LIS;
    }
}
