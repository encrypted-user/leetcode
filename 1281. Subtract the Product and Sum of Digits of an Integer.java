class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int b = n % 10;
            sum += b;
            product *= b;
            n /= 10;
        }
        return product - sum;
    }
}