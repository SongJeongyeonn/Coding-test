import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() * in.nextInt();
        int b = in.nextInt() * in.nextInt() * in.nextInt();
        System.out.print(a-b);
    }
}