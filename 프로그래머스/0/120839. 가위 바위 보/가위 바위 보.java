class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            char m = rsp.charAt(i);
            if(m == '0')
                answer = answer +  "5";
            else if(m == '2')
                answer = answer +  "0";
            else
                answer = answer +  "2";
        }
        return answer;
    }
}