import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        StringBuilder result = new StringBuilder("AKARAKA");
        for (int i = 1; i < K; i++) {
            result.append("RAKA");
        }
        System.out.println(result);
    }
}
