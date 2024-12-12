class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0, size = num_list.length;
        int[] answer = new int[size-(n-1)];
        for(int i = n-1; i < size; i++){
            answer[cnt] = num_list[i];
            cnt++;
        }
        return answer;
    }
}