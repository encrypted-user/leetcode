class Solution {
    public boolean checkIfExist(int[] arr) {

        //Can be done using HashSet and HashMap

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (j == i)
                    continue;
                if (arr[i] * 2 == arr[j])
                    return true;
            }
        }
        return false;
    }
}