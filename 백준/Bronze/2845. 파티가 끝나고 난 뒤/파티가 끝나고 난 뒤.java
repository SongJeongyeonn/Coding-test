import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt() * in.nextInt();
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++)
            arr[i] = in.nextInt();
        for(int i = 0; i < 5; i++)
            System.out.printf("%d ",arr[i]-r);
    }
}