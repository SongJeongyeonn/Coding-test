import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(!answer.contains(numbers[i] + numbers[j]))
                    answer.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}