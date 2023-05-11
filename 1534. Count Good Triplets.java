class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        // n*n-1*n-2
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int p = Math.abs(arr[i] - arr[j]);
                if (p <= a) {

                    for (int k = j + 1; k < n; k++) {
                        int q = Math.abs(arr[j] - arr[k]);
                        int r = Math.abs(arr[i] - arr[k]);
                        if (q <= b && r <= c)
                            count++;

                    }
                }
            }
        }
        return count;
    }

}