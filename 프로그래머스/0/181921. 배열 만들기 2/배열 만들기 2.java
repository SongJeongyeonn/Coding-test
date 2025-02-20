import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean isValid = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit != 0 && digit != 5) {
                    isValid = false;
                    break;
                }
                num /= 10;
            }
            if (isValid) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
        }
}