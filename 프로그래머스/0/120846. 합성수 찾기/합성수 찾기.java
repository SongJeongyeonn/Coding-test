class Solution {
    public int solution(int n) {
        int answer = 0;
        int count;
        for(int i = 1; i <= n; i++){
            count = 0;
            for(int j = 1; j <= i; j++){
                count += (i % j == 0) ? 1 : 0; // 나눠 떨어지면 약수이므로 1증가
            }
            answer += (count >= 3) ? 1 : 0; // 약수가 3개 이상은 합성수로 1증가
        }
        return answer;
    }
}