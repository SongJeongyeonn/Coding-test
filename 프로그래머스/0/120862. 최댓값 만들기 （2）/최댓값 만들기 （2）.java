class Solution {
    public int solution(int[] numbers) {
        int big1 = Integer.MIN_VALUE, big2 = Integer.MIN_VALUE;
        int sma1 = Integer.MAX_VALUE, sma2 = Integer.MAX_VALUE;
        
        for (int num : numbers) {
            if (num > big1) {
                big2 = big1;
                big1 = num;
            } else if (num > big2) {
                big2 = num;
            }
            
            if (num < sma1) {
                sma2 = sma1;
                sma1 = num;
            } else if (num < sma2) {
                sma2 = num;
            }
        }
        
        return Math.max(big1 * big2, sma1 * sma2);
    }
}