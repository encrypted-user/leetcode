class Solution {
    public boolean isHappy(int n) {
        HashSet < Integer > set = new HashSet < Integer > ();
        set.add(n);
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (!set.add(sum))
                return false;
            n = sum;
        }
        return true;
    }
}