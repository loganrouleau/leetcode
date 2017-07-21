// 20. Valid Parentheses

public class Problem20Easy{
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
            return isValid(s.substring(0, index - 1) + s.substring(index + 2, s.length() - 1));
        }
        index = s.indexOf("{}");
        if(index != -1){
            return isValid(s.substring(0, index - 1) + s.substring(index + 2, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isValid("{[()]}"));
    }
}

