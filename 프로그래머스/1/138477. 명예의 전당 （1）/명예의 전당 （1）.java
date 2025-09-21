import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> num = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            num.add(score[i]);
            Collections.sort(num);
            answer[i] = i < k ? num.get(0) : num.get(num.size()-k);
        }
        return answer;
    }
}