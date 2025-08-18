import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        int size = answer.length;
        Arrays.sort(answer);
        for (int i = 0; i < size / 2; i++) {
            char temp = answer[i]; // 원래 값은 temp에 넣어놓고
            answer[i] = answer[answer.length - 1 - i]; // 원래 값이 있던 자리에 끝 값부터 넣는다.
            answer[answer.length - 1 - i] = temp; // 이렇게 하면 대~소가 소~대로 변환.
        }
        return new String(answer); // 결과로 문자열을 리턴하라고 하였기에 String으로 바꾸기.
    }
}