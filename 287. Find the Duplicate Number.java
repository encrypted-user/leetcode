class Solution {
  public int findDuplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int j = nums[i] - 1;
      if (nums[i] != nums[j])
        nums[i] = (nums[i] + nums[j]) - (nums[j] = nums[i]);
      else
        i++;
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1)
        return nums[i];
    }
    return -1;
  }
}