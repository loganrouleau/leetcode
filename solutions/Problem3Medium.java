// 3. Longest Substring Without Repeating Characters

public class Problem3Medium {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int len = 1;
        int maxLen = 1;
        String sub = s.substring(0, 1);
        for (int index = 1; index < s.length(); index++) {
            String currChar = Character.toString(s.charAt(index));
            if (sub.length() - sub.replace(currChar, "").length() == 0) {
                sub += currChar;
                len++;
                maxLen = len > maxLen ? len : maxLen;
            } else {
                sub = sub.substring(sub.lastIndexOf(currChar) + 1) + currChar;
                len = sub.length();
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcdbba"));
    }
}
