class Solution {
    public int solution(int[] arr) {
        int i, j, answer = 0;
        long big = 1;
        for(i = 0; i < arr.length; i++)
        {
            big *= arr[i]; // 공배수를 구한다.
        }
        for(i = 1; i <= big; i++) // 1부터 그 공배수와 작거나 같은 동안 반복을 시킨다.
        {
            answer = i; // i의 값이 최소공배수일 수 있기에, answer에 저장한다.
            for(j = 0; j < arr.length; j++) // 배열 인덱스 번호가 될 변수이다.
            {
                if(i%arr[j] != 0 && arr[j] != 1) // 각 인덱스의 값을 비교해 약수가 아니면
                {
                    answer = 0;
                    break; // answer에 0을 저장하고, 반복문을 탈출한다.
                }   
            }
            if(answer != 0) // 그렇기에, answer이 0이 아니라면, 최소공배수라는 것이기에
            {
                break; // 반복문을 탈출한다.
            }
        }
        return answer;
    }
}