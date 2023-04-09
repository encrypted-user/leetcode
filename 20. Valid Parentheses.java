class Solution {
    public boolean isValid(String s) {
        Stack < Character > st = new Stack < > ();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (st.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
                return false;
            else {
                if (ch == ')') {
                    char dh = (char) st.peek();
                    if (!(dh == '('))
                        return false;
                    st.pop();
                } else if (ch == '}') {
                    char dh = (char) st.peek();
                    if (!(dh == '{'))
                        return false;
                    st.pop();
                } else if (ch == ']') {
                    char dh = (char) st.peek();
                    if (!(dh == '['))
                        return false;
                    st.pop();
                }
            }

        }
        if (!st.isEmpty())
            return false;
        return true;
    }
}