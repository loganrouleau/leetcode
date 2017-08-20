// 58. Length of Last Word

public class Problem058_easy {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int length = 1;
        int i = s.length() - 1;
        while (i - 1 >= 0 && s.charAt(i - 1) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
