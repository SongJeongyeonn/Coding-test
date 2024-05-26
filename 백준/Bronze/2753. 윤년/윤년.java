import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num % 4 == 0 && num % 100 != 0)||(num % 400 == 0))
            res = 1;
        System.out.println(res);
    }
}