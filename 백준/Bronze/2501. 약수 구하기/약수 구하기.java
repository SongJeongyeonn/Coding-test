import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                if(++cnt == k){
                    System.out.print(i);
                    break;
                }
        }
        if(cnt != k)
            System.out.print("0");
    }
}