class Solution {
    public int solution(int[] box, int n) {
        int X = box[0] / n, Y = box[1] / n, Z = box[2] / n;
        int answer = X * Y * Z;

        return answer;
    }
}