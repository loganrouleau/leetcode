// 20. Valid Parentheses

public class Problem020_easy {
    public static boolean isValid(String s){
        if(s.length() == 0){
            return true;
        }
        int index = s.indexOf("()");
        if(index != -1){
            return isValid(s.substring(0, index ) + s.substring(index + 2, s.length()));
        }
        index = s.indexOf("[]");
        if(index != -1){
            return isValid(s.substring(0, index ) + s.substring(index + 2, s.length()));
        }
        index = s.indexOf("{}");
        if(index != -1){
            return isValid(s.substring(0, index ) + s.substring(index + 2, s.length()));
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isValid("({[]{}}())"));
    }
}

