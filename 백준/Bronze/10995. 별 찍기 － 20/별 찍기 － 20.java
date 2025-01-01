import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for(int i = 0; i < size; i++){
            if(i%2 != 0)
                System.out.print(" ");
            for (int j = 0; j < size; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}