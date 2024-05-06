import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int i, answer = 0;
        Arrays.sort(A); // A배열과 B배열을 모두 오름차순 정리해 준다.
        Arrays.sort(B);
        for(i = 0; i < A.length; i++){
            answer += A[i]*B[A.length-(i+1)]; // 최소와 최댓값을 곱해야 하기에, B의 인덱스 번호는 끝 번호부터 시작하게 한다.
        }
        return answer; // 값을 반환한다.
    }
}