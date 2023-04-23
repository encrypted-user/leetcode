class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        long left = 1, right = num; // long type to avoid 2147483647 case

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long t = mid * mid;
            if (t > num) {
                right = mid - 1;
            } else if (t < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}