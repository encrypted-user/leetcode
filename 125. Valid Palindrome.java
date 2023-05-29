class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll(" ", "");
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        System.out.println(sbr.toString());
        if ((sbr.toString()).equalsIgnoreCase(s))
            return true;
        return false;

    }

}