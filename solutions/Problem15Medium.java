// 15. 3Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15Medium {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 2; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            int b = a + 1;
            int c = nums.length - 1;
            while (b < c) {
                if (nums[b] + nums[c] == -nums[a]) {
                    result.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    b++;
                    c--;
                    while (b < c && nums[b] == nums[b - 1]) b++;
                    while (b < c && nums[c] == nums[c + 1]) c--;
                } else if (nums[b] + nums[c] < -nums[a]) {
                    b++;
                } else {
                    c--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
