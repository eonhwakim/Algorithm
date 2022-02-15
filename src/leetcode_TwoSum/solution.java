package leetcode_TwoSum;

/*
* 1. 하나의 값을 기준으로 모든 배열을 탐색하면서 값을 더해나간다
* 2. 더해나가는 값들이 target값과 같아진다면 해당 i,j값을 리턴한다
* 3. 이중 for 문 -> 시간복잡도 O(n^2) => 매우 비효율적인 연산!
*
* */


class Test {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0, 0};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;

    }

}
    
public class solution{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Test test = new Test();
        int[] result = test.twoSum(nums, target);
        System.out.println(result[0] +","+ result[1]);
    }
}