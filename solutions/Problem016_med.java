// 16. 3Sum Closest

import java.util.Arrays;

public class Problem016_med {
    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 2; a++) {
            int b = a + 1;
            int c = nums.length - 1;
            if (a == 0) result = nums[a] + nums[b] + nums[c];
            while (b < c) {
                int currSum = nums[a] + nums[b] + nums[c];
                result = Math.abs(target - result) < Math.abs(target - currSum) ? result : currSum;
                if (currSum < target) b++;
                else if (currSum > target) c--;
                else return target;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }
}
