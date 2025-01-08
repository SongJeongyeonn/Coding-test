import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] sorted = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sorted);
        int[] answer = Arrays.copyOfRange(sorted, 0, 5);
        return answer;
    }
}