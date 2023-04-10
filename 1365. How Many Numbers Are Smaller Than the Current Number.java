class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int buck[] = new int[101];
        int i;
        for (i = 0; i < nums.length; i++)
            buck[nums[i]] += 1;
        for (i = 1; i <= 100; i++)
            buck[i] += buck[i - 1];
        for (i = 0; i < nums.length; i++) {
            int pos = nums[i];
            nums[i] = pos == 0 ? 0 : buck[pos - 1];

        }
        return nums;
    }
}