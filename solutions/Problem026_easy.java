// 26. Remove Duplicates from Sorted Array

public class Problem026_easy {
    public static int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int result = 1;
        for(int num : nums){
            if(nums[result - 1] < num){
                nums[result] = num;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 3, 4, 4, 5, 5, 5, 5}));
        System.out.println(removeDuplicates(new int[]{0}));
    }

}
