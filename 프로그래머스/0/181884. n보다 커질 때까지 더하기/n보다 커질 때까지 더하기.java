class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0, i = 0;
        while(answer <= n)
        {
            answer += numbers[i];
            i++;
        }
        return answer;
    }
}