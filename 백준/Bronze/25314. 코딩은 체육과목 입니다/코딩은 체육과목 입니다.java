import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n/4; i++)
                System.out.print("long ");
        System.out.print("int");
    }
}