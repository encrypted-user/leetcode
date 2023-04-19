class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int lb = -1, lmin = -1, lmax = -1;
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                lmin = (nums[i] == minK) ? i : lmin;
                lmax = (nums[i] == maxK) ? i : lmax;
                count += Math.max(0, Math.min(lmin, lmax) - lb);
            } else {
                lb = i;
                lmin = -1;
                lmax = -1;
            }
        }

        return count;
    }
}