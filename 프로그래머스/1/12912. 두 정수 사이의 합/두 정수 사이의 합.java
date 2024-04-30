class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i, c = a; // 반복문 안에서 사용할 변수 i, a의 값이 바뀌었을 때를 대비해 변수 c 선언
        a = a < b ? a : b; // b와 비교해 a를 비교해 작은 값을 넣어주고
        b =  b > c ? b : c; // b는 a값이 들어있는 c와 비교해 큰 값을 넣어준다.
        for(i = a; i <= b; i++){
            answer += i; // a부터 b까지 i가 1씩 증가하고, 그 값이 answer에 저장이된다.
        }
        return answer; // 반환해 준다.
    }
}