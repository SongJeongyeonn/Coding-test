import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++){
            int h = in.nextInt(), w = in.nextInt(), n = in.nextInt();
        if(n%h == 0)
            System.out.printf("%d%02d\n",h,n/h);
        else
            System.out.printf("%d%02d\n",n%h,n/h+1);
        }
    }
}