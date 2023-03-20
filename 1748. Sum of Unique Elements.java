class Solution {
    public int sumOfUnique(int[] nums) {
        int[] flag = new int[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            flag[nums[i]]++;
        for (int i = 1; i < 101; i++)
            if (flag[i] == 1)
                sum += i;
        return sum;
    }
}