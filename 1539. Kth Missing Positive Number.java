class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet < Integer > hashSet = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        for (int i = 1; i <= 1000 + k + arr.length; i++) {
            if (!hashSet.contains(i)) {
                k--;
                if (k == 0)
                    return i;
            }
        }
        return -1;
    }
}