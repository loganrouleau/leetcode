// 14. Longest Common Prefix

public class Problem014_easy {


    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }

        String candidate = strs[0];
        for(int index = 1; index < strs.length; index++){
            int cut = 0;

            if(strs[index].isEmpty() || candidate.isEmpty()){
                return "";
            }

            while(strs[index].charAt(cut) == candidate.charAt(cut)){
                cut++;
                if(cut == strs[index].length() || cut == candidate.length()){
                    break;
                }
            }
            candidate = candidate.substring(0, cut);
        }
        return candidate;
    }

    public static void main(String[] args){
        //String[] test = {"1234", "12345", "1234567", "1234567", ""};
        String[] test = {};
        System.out.println(longestCommonPrefix(test));
    }
}
