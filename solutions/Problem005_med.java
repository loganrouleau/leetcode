// 5. Longest Palindromic Substring

public class Problem005_med {

    private static String expand(String s, int left, int right) {

        if (left < 0 || right >= s.length()) {
            return "";
        }

        while (s.charAt(left) == s.charAt(right)) {

            left--;
            right++;

            if (left < 0 || right >= s.length()) {
                return s.substring(left + 1, right);
            }
        }

        return s.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {
        String revS = "";
        String currString;

        for (int i = 0; i < s.length(); i++) {
            currString = expand(s, i, i).length() > expand(s, i, i + 1).length() ? expand(s, i, i) : expand(s, i, i + 1);

            revS = currString.length() > revS.length() ? currString : revS;

        }

        return revS;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcdcda"));
    }
}
