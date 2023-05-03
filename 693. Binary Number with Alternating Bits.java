class Solution {
    public boolean hasAlternatingBits(int n) {
        char a[] = Integer.toBinaryString(n).toCharArray();
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                return false;
        }
        return true;
    }

}