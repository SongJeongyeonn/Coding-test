class Solution {
    public long solution(long n) {
        long answer = 0, i;
        for(i = 1; i <= n; i++) // n의 제곱근은 n보다는 같거나 작다.
        {
            if(i*i == n){ // 만약 n의 제곱근이 나오면
                i++; // 제곱근에 1을 더하고
                answer = i*i; // 그 더한 수의 제곱을 저장한다.
                break; // 그리고 반복문을 탈출한다.
            }
            else if(n < i*i){ // 만약 n이 i의 제곱보다 작다면, 정수의 제곱이 아니기에
                answer = -1; // -1을 저장한다.
                break; // 그리고 반복문을 탈출한다.
            }
        }
        return answer; // 저장된 값을 반환한다.
    }
}