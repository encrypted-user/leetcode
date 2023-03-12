class Solution {
    public int singleNumber(int A[]) {
        if (A.length == 1)
            return A[0];
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}