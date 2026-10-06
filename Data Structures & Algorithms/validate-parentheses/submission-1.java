class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char brac = s.charAt(i);

            if (brac == '(' || brac == '{' || brac == '[') {
                a.push(brac);
            } else {
                // closing bracket with nothing to match
                if (a.isEmpty()) return false;

                if (brac == ')' && a.peek() != '(') return false;
                if (brac == '}' && a.peek() != '{') return false;
                if (brac == ']' && a.peek() != '[') return false;

                // match found → remove opening bracket
                a.pop();
            }
        }

        // valid only if no unmatched openings remain
        return a.isEmpty();
    }
}
