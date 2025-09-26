class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0, cnt ;
        for(int i = 1; i <= number; i++){
            cnt = 0;
            for(int j = 1; j*j <= i; j++){
                cnt = j*j == i ? cnt+1 : i%j == 0 ? cnt+2 :cnt;
                if(cnt > limit){
                    cnt = power;
                    break;
                }
            }
            answer += cnt;
        }
        return answer;
    }
}