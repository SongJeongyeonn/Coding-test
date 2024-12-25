class Solution {
    public String solution(int age) {
        String answer = "";
        while(age > 0){
            answer += (char)(age%10+97);
            age /= 10;
        }
        return new StringBuilder(answer).reverse().toString();
    }
}