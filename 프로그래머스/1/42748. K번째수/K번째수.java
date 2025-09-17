import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt;
        for(int i = 0; i < commands.length; i++){
            int[] num = new int[commands[i][1] - commands[i][0] + 1];
            cnt = 0;
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                num[cnt] = array[j];
                cnt++;
            }
            Arrays.sort(num);
            answer[i] = num[commands[i][2]-1];
        }
        
        return answer;
    }
}