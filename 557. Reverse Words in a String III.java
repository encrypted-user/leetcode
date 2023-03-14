class Solution {
    public String reverseWords(String s) {
        StringBuilder sbr = new StringBuilder();
        for (String i: s.split("\\s+")) {
            StringBuffer sbuffer = new StringBuffer(i);
            sbr.append(sbuffer.reverse() + " ");
        }
        return sbr.toString().trim();
    }
}