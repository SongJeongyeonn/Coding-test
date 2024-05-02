class Solution {
    public int solution(int n) {
        int i, answer = 0;
        for(i = 2; i <= n; i++) // n은 3 이상의 수이기에, i의 초깃값을 2로 지정한다.
        {
            if(n%i == 1) // 나머지의 값이 1일 때
            {
                answer = i; // i의 값을 answer에 저장하고
                break; // 반복문을 빠져나온다.
            }
        }
        return answer; // 결과를 반환한다.
    }
}