class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fi = new int[n+1];
        fi[0] = 1;
        fi[1] = 1;
        for(int i = 2; i < n; i++){
            fi[i] = (fi[i-1] + fi[i-2])%1234567;
        }
        return answer = fi[n-1];
    }
}