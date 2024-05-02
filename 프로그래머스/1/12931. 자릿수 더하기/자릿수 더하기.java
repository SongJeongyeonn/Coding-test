import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        do
        {
            answer += n%10; // 1의 자리수의 값을 더한다.
            n = (n - n%10)/10; // 위에서 더한수를 빼고, 자리수를 내린다.
        }while(n > 0); 
        
        System.out.println(answer); // 값을 출력한다.

        return answer;
    }
}