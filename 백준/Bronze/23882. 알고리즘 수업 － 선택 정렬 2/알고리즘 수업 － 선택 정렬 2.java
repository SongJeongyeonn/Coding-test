import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        int cnt = 0, i, j;
        int[] A = new int[N];

        for (i = 0; i < N; i++)
            A[i] = in.nextInt();
        for (i = N - 1; i > 0; i--) {
            int max = i;
            for (j = i-1; j >= 0; j--)
                if (A[j] > A[max])
                    max = j;
            if (max != i) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
                cnt++;
                if (cnt == K) {
                    for(i = 0; i < N; i++)
                        System.out.printf("%d ", A[i]);;
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}