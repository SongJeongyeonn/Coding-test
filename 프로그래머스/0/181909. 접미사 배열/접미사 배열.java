import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        int i, j;
        String[] answer = new String[my_string.length()];
        for(i = 0; i < my_string.length(); i++){
            answer[i] = "";
            for(j = i; j < my_string.length(); j++)
                answer[i] += my_string.charAt(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}