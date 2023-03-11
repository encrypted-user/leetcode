class Solution {
    public int findMin(int[] nums) {
        final int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[n - 1])
            return nums[0];
        int start = 0, end = n - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return nums[mid];
            } else {
                if (nums[mid] >= nums[start] && nums[mid] <= nums[end])
                    return nums[start];
                else if (nums[mid] >= nums[start]) {
                    start = mid + 1;
                } else if (nums[mid] <= nums[end])
                    end = mid - 1;
            }
        }
        return -1;
    }
}