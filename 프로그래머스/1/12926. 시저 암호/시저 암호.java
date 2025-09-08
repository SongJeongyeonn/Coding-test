class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ')
                c = ' ';
            else{
                int cnt = n;
                while(cnt > 0){
                    if(c == 'z' || c == 'Z')
                        c -= 25;
                    else
                        c += 1;
                    cnt--;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}