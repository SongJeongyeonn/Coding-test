class Solution {
    public int solution(int[] numbers) {
        int answer = 0, cnt = 0;
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j < numbers.length; j++)
                if(numbers[j] == i)
                    cnt++;
            answer = cnt > 0 ? answer : answer+i;
            cnt = 0;
        }
        return answer;
    }
}