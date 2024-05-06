import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] temp = s.split(" "); // 문자열을 배열에 공백을 기준으로 나누어 저장한다.
        int[] num = new int[temp.length]; // 음수도 비교하기 위해  정수형 배열을 선언한다.
        for(int i = 0; i < temp.length; i++){
            num[i] = Integer.parseInt(temp[i]); // 문자열 배열의 값을 정수형 배열로 움긴다.
        }
             Arrays.sort(num); // 오름차순으로 정렬한다.
            return num[0] + " " + num[num.length-1]; // 공백을 두고 최소값과 최대값을 출력한다.
    }
}