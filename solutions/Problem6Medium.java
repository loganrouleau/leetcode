// 6. ZigZag Conversion

public class Problem6Medium {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        String result = "";
        for (int row = 0; row < numRows; row++) {
            int i = row;
            while (i >= 0 && i < s.length()) {
                result += s.charAt(i);
                i += 2 * numRows - 2;
                if (row != 0 && row != numRows - 1 && i - 2 * row < s.length()) {
                    result += s.charAt(i - 2 * row);
                }
            }
        }

        return result;
    }
}
