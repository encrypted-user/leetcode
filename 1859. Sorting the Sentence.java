class Solution {
    public String sortSentence(String s) {
        StringBuilder sbr = new StringBuilder();
        String[] result = new String[s.split(" ").length];
        for (String st: s.split(" ")) {
            int length = st.length();
            result[st.charAt(length - 1) - 48 - 1] = st.substring(0, length - 1);
        }


        for (int i = 0; i < result.length; i++)
            sbr.append(result[i] + " ");
        return sbr.toString().trim();
    }
}