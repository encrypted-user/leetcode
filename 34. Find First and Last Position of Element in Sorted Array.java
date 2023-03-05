class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            firstOccurence(nums, target),
                lastOccurence(nums, target)
        };
    }

    private int firstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0, res = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return res;
    }

    private int lastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0, res = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return res;
    }
}