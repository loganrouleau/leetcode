// 9. Palindrome Number

public class Problem009_easy {
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        String input = Integer.toString(x);
        int len = input.length();
        for(int i = 0; i < len / 2; i++){
            if(input.charAt(i) != input.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(1234321));
    }
}
