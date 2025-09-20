import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        int cnt = 0;
        for(int i = 97; i <= 122; i++){
            for(int j = 0; j < strings.length; j++){
                 if((char)i == strings[j].charAt(n)){
                     answer[cnt] = strings[j];
                     cnt++;
                 }
            }
        }
        return answer;
    }
}