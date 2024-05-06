class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] sum = new long[n+1];
        sum[0] = 1;
        sum[1] = 2;
        for (int i = 2; i < n; i++) {
            sum[i] = (sum[i - 1] + sum[i - 2])%1234567;
        }
        answer = sum[n-1];
        return answer;
    }
}