class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int i = 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
        }
        return s.length() - 1 - i;
    }
}