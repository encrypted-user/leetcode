class Solution {
    public String reverseVowels(String s) {
        final int length = s.length();
        if (length == 1)
            return s;
        int start = 0, end = length - 1;
        final String vowels = "aeiouAEIOU";
        char[] charArray = s.toCharArray();
        while (start <= end) {
            while (start < end && vowels.indexOf(charArray[start]) == -1)
                start++;
            while (start < end && vowels.indexOf(charArray[end]) == -1)
                end--;
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(charArray);
    }
}