class Solution {
    public String solution(String my_string) {
        String answer = "";
        int index;
        boolean[] ch = new boolean[53];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c == ' ')
                index = 52;
            else if (Character.isLowerCase(c))
                index = c - 'a' + 26;
            else
                index = c - 'A';

            if (!ch[index]) {
                ch[index] = true;
                answer+=c;
            }
        }
        return answer;  
    }
}