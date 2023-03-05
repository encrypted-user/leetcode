class Solution {
    public int findPeakElement(int[] nums) {
        int mid = 0, length = nums.length;
        if (length == 1)
            return 0;
        int start = 0, end = length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid > 0 && mid < length - 1) {
                if (nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1])
                    return mid;
                else if (nums[mid - 1] > nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (mid == 0) {
                if (nums[0] > nums[1])
                    return 0;
                else
                    return 1;
            } else if (mid == length - 1) {
                if (nums[length - 2] > nums[length - 1])
                    return length - 2;
                else
                    return length - 1;
            }
        }
        return -1;
    }


    // public int findPeakElement(int[] nums) {
    //     int start = 0, end = nums.length - 1;
    //     while (start < end) {
    //         int mid = (start + end) / 2;
    //         if (nums[mid] > nums[mid + 1])
    //             end = mid;
    //         else
    //             start = mid + 1;
    //     }
    //     return start;
    // }
}