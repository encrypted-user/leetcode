class Solution {
    public int missingNumber(int[] nums) {
        int sumOfNumbers = 0, sumOfIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sumOfIndex += i;
            sumOfNumbers += nums[i];
        }
        return sumOfIndex - sumOfNumbers;
    }


    //    int res = nums.length;
    //     for (int i = 0; i < nums.length; i++) {
    //         res ^= i;
    //         res ^= nums[i];
    //     }
    //     return res;