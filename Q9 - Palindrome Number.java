//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int sum=0;
        while(x>0)
        {
            int b = x%10;
            sum=sum*10+b;
            x=x/10;
        }
        if(sum==copy)
            return true;
        return false;
    }
}