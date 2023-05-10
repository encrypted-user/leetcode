class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i, j, c = 0;
        int n = nums.length;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    c++;
            }
        }
        return c;
    }
}