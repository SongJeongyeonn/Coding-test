import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(), max = in.nextInt();
        int[] weights = new int[size + 1];
        int[] values = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }
        int[] dp = new int[max + 1];
        for (int i = 1; i <= size; i++) {
            for (int w = max; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + values[i]);
            }
        }
        System.out.println(dp[max]);
    }
}