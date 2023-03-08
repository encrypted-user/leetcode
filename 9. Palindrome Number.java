//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int sum = 0;
        while (x > 0) {
            int b = x % 10;
            sum = sum * 10 + b;
            x = x / 10;
        }
        if (sum == copy)
            return true;
        return false;
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         if (x<0 || (x!=0 && x%10==0)) return false;
//         int rev = 0;

//         while (x>rev){
//             rev = rev*10 + x%10;
//             x = x/10;
//         }

//         return (x==rev || x==rev/10);
//     }
// }