import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        answer = Arrays.stream(answer).filter(s -> !s.isEmpty()).toArray(String[]::new);
        int size = answer.length;
        for(int i = 0; i < size; i++)
            answer[i] = answer[i].toLowerCase();
        Arrays.sort(answer);
        return answer;
    }
}