class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length();
        for(int i = 0; i < size; i++){
            if(size - i > 4)
                answer += '*';
            else
                answer += phone_number.charAt(i);
        }
        return answer;
    }
}