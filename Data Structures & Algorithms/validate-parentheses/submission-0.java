class Solution {
    public boolean isValid(String s) {
        Stack<Character> validpara = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                validpara.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (validpara.isEmpty()) return false;

                char top = validpara.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return validpara.isEmpty();
    }
}
