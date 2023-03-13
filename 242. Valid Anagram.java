class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        if (s.equals(t))
            return true;
        if (s.isEmpty() && t.isEmpty())
            return true;

        int[] a = Anagram(s);
        int[] b = Anagram(t);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;

    }
    public int[] Anagram(String s) {
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[((int) ch - 97)]++;
        }
        return count;
    }

}