class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[1] = n*m;
        while(m != 0){
            int temp = n%m;
            n = m;
            m = temp;
        }
        answer[0] = n;
        answer[1] /= n;
        return answer;
    }
}