class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // skip non-alphanumeric on left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // skip non-alphanumeric on right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // compare
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
