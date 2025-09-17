class Solution {
    public int solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                answer += s.charAt(i);
            } else if(s.charAt(i) == 'o'){
                answer += '1';
                i += 2;
            } else if(s.charAt(i) == 't' && s.charAt(i+1) == 'w'){
                answer += '2';
                i += 2;
            } else if(s.charAt(i) == 't' && s.charAt(i+1) == 'h'){
                answer += '3';
                i += 4;
            } else if(s.charAt(i) == 'f' && s.charAt(i+1) == 'o'){
                answer += '4';
                i += 3;
            } else if(s.charAt(i) == 'f' && s.charAt(i+1) == 'i'){
                answer += '5';
                i += 3;
            } else if(s.charAt(i) == 's' && s.charAt(i+1) == 'i'){
                answer += '6';
                i += 2;
            } else if(s.charAt(i) == 's' && s.charAt(i+1) == 'e'){
                answer += '7';
                i += 4;
            }  else if(s.charAt(i) == 'e'){
                answer += '8';
                i += 4;
            }  else if(s.charAt(i) == 'n'){
                answer += '9';
                i += 3;
            } else{
                answer += '0';
                i += 3;
            }
        }
        return Integer.parseInt(answer);
    }
}