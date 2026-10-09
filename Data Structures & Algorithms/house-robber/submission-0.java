class Solution {

    public int rob(int[] nums) {
        // initialize cache
        int n = nums.length;
        int[] cost = nums;
        int[] memo = new int[n];

        // fill rows with -1
        Arrays.fill(memo,-1);

        int best = 0;
        return dfs(0,nums, memo);

    }

    public int dfs(int i, int[] nums, int[] memo){
        // base cases:
        if (i>=nums.length) return 0;
        // check cache
        if (memo[i]!= -1) return memo[i];

        // compute skip and rob
        int skip = dfs(i+1, nums, memo);
        int rob = nums[i] + dfs(i+2, nums, memo);

        // store in cache
        memo[i] = Math.max(skip, rob);
        return memo[i];
    }


}
