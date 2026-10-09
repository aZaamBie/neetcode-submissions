class Solution {

    public int rob(int[] nums) {
        // initialize cache/memo
        int n = nums.length;
        int[] memo = new int[n];

        // fill rows with -1
        Arrays.fill(memo,-1);

        return dfs(0,nums, memo); // call recursion
    }

    public int dfs(int i, int[] nums, int[] memo){
        // base cases: check if index is outside array length
        if (i>=nums.length) return 0;
        // check cache -> return if value found
        if (memo[i]!= -1) return memo[i];

        // compute skip and rob
        int skip = dfs(i+1, nums, memo);
        int rob = nums[i] + dfs(i+2, nums, memo);

        // choose one that give most monry + store in cache
        return memo[i] = Math.max(skip, rob);
    }

}
