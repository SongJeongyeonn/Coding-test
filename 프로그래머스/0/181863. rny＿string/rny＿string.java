class Solution {
    public String solution(String rny_string) {
        int size = rny_string.length();
        String answer = "";
        for(int i = 0; i < size; i++){
            if(rny_string.charAt(i) == 'm'){
                answer += "rn";
            } else
                answer += rny_string.charAt(i);
        }
        return answer;
    }
}