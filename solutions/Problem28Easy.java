// 28. Implement strStr()

public class Problem28Easy{
    public static int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(needle.length() == 0){
            return 0;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int result = i;
            int j = 0;
            while(haystack.charAt(i + j) == needle.charAt(j)){
                j++;
                if(j == needle.length()){
                    return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr("y", ""));
    }
}
