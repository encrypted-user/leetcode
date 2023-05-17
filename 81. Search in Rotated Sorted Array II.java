class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            if (nums[start] == target)
                return true;
            if (nums[end] == target)
                return true;
            start++;
            end--;
        }
        return false;
    }
}