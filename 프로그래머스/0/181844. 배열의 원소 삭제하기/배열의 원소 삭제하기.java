import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}