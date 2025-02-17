class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int size = queries.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            int sma = -1;
            for (int j = s; j <= e; j++)
                if (arr[j] > k) 
                    sma = sma == -1 || sma > arr[j] ? arr[j] : sma;
            answer[i] = sma;
        }
        return answer;
    }
}
