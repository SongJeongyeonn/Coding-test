import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n",i, a, b, a+b);
        }
    }
}