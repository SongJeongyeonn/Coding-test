import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int size = nums.length/2;
        nums = Arrays.stream(nums).distinct().toArray();
        int answer = size > nums.length ? nums.length : size;
        return answer;
    }
}