class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int innerCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            innerCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (allowed.indexOf(ch) != -1)
                    innerCount++;
            }
            if (innerCount == words[i].length())
                count++;
        }
        return count;
    }
}