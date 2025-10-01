class Solution {
    public String solution(int a, int b) {
        String[] answer = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int num = b-1;
        a -= 1;
        while(a > 0){
            if(a == 2)
                num += 29;
            else if((a <= 7&& a%2 != 0) || (a >= 8 && a%2 == 0))
                num += 31;
            else
                num += 30;
            a--;
        }
        num %= 7;
        return answer[num];
    }
}
