// 38. Count and Say

public class Problem038_easy {

    public static String countAndSay(int n){
        if(n <= 1){
            return "1";
        }
        String input = countAndSay(n - 1);
        int count = 0;
        String output = "";
        char currChar = input.charAt(0);
        for(char c : input.toCharArray()){
            if(c != currChar){
                output = output + Integer.toString(count) + Character.toString(currChar);
                currChar = c;
                count = 0;
            }
            count++;
        }
        output = output + Integer.toString(count) + Character.toString(currChar);
        return output;
    }

    public static void main(String[] args){
        System.out.println(countAndSay(15));
    }
}
