class Solution {
    public int solution(int num, int k) {
        String cnt = Integer.toString(num);
        int i;
        for(i = 0; i < cnt.length(); i++)
            if(cnt.charAt(i)-'0' == k)
                break;
        i = i == cnt.length() ? -1 : i+1;
        return i;
    }
}