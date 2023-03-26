class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int high = n;
        int low = 0;
        int result[] = new int[n + 1];
        while (low <= high) {
            if (Math.abs(nums[low]) > Math.abs(nums[high])) {
                result[n] = nums[low] * nums[low];
                low++;
            } else {
                result[n] = nums[high] * nums[high];
                high--;
            }
            n--;
        }
        return result;
    }
}