class Solution {
    public boolean areOccurrencesEqual(String s) {
        int flag[] = new int[26];
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            flag[s.charAt(i) - 97]++;
        }
        int res = flag[s.charAt(0) - 97];
        for (i = 0; i < 26; i++)
            if (flag[i] != 0)
                if (res != flag[i])
                    return false;
        return true;
    }
}