class Solution {
    public long solution(long n) {
        int[] num = new int[10];
        long answer = 0;
        while(n > 0){
            num[(int)(n % 10)]++;
            n/=10;
        }
        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < num[i]; j++)
                answer= answer*10+i;
        }
        return answer;
    }
}