class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0, size1 = s1.length, size2 = s2.length;
        for(int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                if(s1[i].equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}