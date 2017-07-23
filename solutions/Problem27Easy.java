// 27. Remove Element

public class Problem27Easy{
    public static int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }

        int result = 0;
        for(int n : nums){
            if(n != val){
                nums[result] = n;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(removeElement(new int[]{2, -1, -1, 6, -1, 8, -1}, -1));
    }
}
