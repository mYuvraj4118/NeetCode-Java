class Solution {
    public boolean isPalindrome(String s) {

        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {

            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);

            if (!Character.isLetterOrDigit(ch1)) {
                p1++;
                continue;
            }

            if (!Character.isLetterOrDigit(ch2)) {
                p2--;
                continue;
            }

            if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
}