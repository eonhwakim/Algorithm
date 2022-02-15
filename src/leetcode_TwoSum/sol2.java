package leetcode_TwoSum;

import java.util.*;

// 더 효율적인 알고리즘 => Hash Table -> 검색하는 시간이 O(1)


class Test2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            for (int j = 0; j < nums.length; j++) {
                Integer k = map.get(target - nums[j]);
                if (k != null && j != k)
                    return new int[]{j, k};
            }
        }
        return nums;
    }
}

public class sol2{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        Test2 test = new Test2();
        int[] result = test.twoSum(nums, target);
        System.out.println(result[0] +","+ result[1]);
    }
}