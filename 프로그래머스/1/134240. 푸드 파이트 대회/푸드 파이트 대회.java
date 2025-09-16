class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            for(int j = food[i]/2; j > 0; j--){
                answer += String.valueOf(i);
            }
        }
        String test = answer;
        answer += String.valueOf(0);
        for(int i = test.length()-1; i >= 0; i--){
            answer += test.charAt(i);
        }
        return answer;
    }
}