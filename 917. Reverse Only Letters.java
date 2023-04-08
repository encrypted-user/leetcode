class Solution {
    public String reverseOnlyLetters(String s) {
        //StringBuilder can be used to directly set characters - setCharAt(index,char)
        //isAlphabet function to be sued to avoid duplicate codes
        if (s.length() == 1 || s.length() == 0)
            return s;
        char chars[] = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end && !((chars[start] >= 65 && chars[start] <= 90) || (chars[start] >= 97 && chars[start] <= 122)))
                start++;
            while (start < end && !((chars[end] >= 65 && chars[end] <= 90) || (chars[end] >= 97 && chars[end] <= 122)))
                end--;
            chars[start] = (char)((int)(chars[start] + chars[end]) - (int)(chars[end] = chars[start]));
            start++;
            end--;
        }
        return new String(chars);
    }
}