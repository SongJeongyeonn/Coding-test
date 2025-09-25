class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            int num = arr1[i] | arr2[i];
            String s = String.format("%" + n + "s", Integer.toBinaryString(num));
            answer[i] = "";
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }
        }
        return answer;
    }
}