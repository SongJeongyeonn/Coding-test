import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int res = a*b;
        while(b > 0){
            System.out.println(a*(b%10));
            b = (b-b%10)/10;
        }
        System.out.print(res);
    }
}