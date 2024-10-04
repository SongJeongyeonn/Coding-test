import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1){
            int a = in.nextInt();
            System.out.print(a*a);
        }
        else{
            int sma = 1000000, big = 2, a;
            for(int i = 0; i < n; i++){
                a = in.nextInt();
                if(sma > a)
                    sma = a;
                if(big < a)
                    big = a;
            }
            System.out.print(sma*big);
        }
    }
}