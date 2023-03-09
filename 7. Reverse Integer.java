//https://leetcode.com/problems/reverse-integer/submissions/
class Solution {
    public int reverse(int num) {
        if(num==0)
            return 0;
        boolean sign = num>0 ? true : false;
        num = Math.abs(num);
        long rev = 0;
        while(num>0) {
            int b = num%10;
            rev=rev*10+b;
            num/=10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
            return 0;
        if(sign)
            return (int)rev;
        return -(int)rev;
    }
}