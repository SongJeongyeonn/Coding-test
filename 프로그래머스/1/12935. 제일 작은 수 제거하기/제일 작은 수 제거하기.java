import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = new int[arr.length - 1];
        int index = 0;
        boolean removed = false;
        for (int num : arr) {
            if (num == min && !removed) {
                removed = true;
                continue;
            }
            answer[index++] = num;
        }
        return answer;
    }
}