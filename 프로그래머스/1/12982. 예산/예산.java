import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, money = 0;
        Arrays.sort(d);
        while(answer < d.length && money+d[answer] <= budget){
            money += d[answer];
            ++answer;
        }
        return answer;
    }
}