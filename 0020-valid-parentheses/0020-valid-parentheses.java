class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack <Character> st = new Stack <>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '[') st.push(']');
            else if (ch == '{') st.push('}');
            else if (ch == '(') st.push(')');
            else { if (st.isEmpty() || st.pop() != ch) return false;
            }
        }
        return st.isEmpty();
    }
}