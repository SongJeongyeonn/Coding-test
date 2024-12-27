import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        while(size > 0){
            int x = in.nextInt(), y = in.nextInt();
            String m1 = (x >= 0 && x < 24 && y >= 0 && y < 60) ? "Yes" : "No";
            String m2 = "No";
            if (x >= 1 && x <= 12) {
                if ((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) && (y >= 1 && y <= 31)) {
                    m2 = "Yes";
                } else if (x == 2 && (y >= 1 && y <= 29)) {
                    m2 = "Yes";
                } else if ((x == 4 || x == 6 || x == 9 || x == 11) && (y >= 1 && y <= 30)) {
                    m2 = "Yes";
                }
            }
            System.out.printf("%s %s\n", m1, m2);
            size--;
        }
    }
}