import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.printf("%d\n%d\n%d\n%d",(a+b)%c ,((a%c)+(b%c))%c , (a*b)%c, (a%c)*(b%c)%c);
    }
}