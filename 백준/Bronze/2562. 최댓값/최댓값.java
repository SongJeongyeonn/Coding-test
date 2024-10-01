import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int big = 0, cnt = 0, n;
        for(int i = 1; i <= 9; i++){
            n = in.nextInt();
            if(n > big){
                big = n;
                cnt = i;
            }
        }
        System.out.printf("%d\n%d", big, cnt);
    }
}