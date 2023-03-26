class Solution {
    public List < Integer > findDisappearedNumbers(int[] nums) {
        List < Integer > list = new ArrayList < > ();
        int i = 0;
        while (i < nums.length) {
            int tempIndex = nums[i] - 1;
            if (nums[i] != nums[tempIndex]) {
                int temp = nums[i];
                nums[i] = nums[tempIndex];
                nums[tempIndex] = temp;
            } else
                i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}