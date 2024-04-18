class Solution {
    public int solution(int age) {
        int answer = 2022;
        while(age > 1)
        {
            age--;
            answer--;
        }
        return answer;
    }
}