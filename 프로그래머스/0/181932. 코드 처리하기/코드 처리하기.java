class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) != '1'){
                if(mode == false && i%2 == 0 || mode == true && i%2 != 0)
                    answer += code.charAt(i);
            }
            else
                mode = !mode;
        }
        answer = answer.trim().isEmpty() ? "EMPTY" : answer;
        return answer;
    }
}