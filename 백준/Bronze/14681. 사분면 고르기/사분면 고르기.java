import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        int res;
        if(x > 0 || y > 0){
            res= x > 0 && y > 0 ? 1 : x > 0 ? 4 : 2;
        }
        else
            res = 3;
        System.out.print(res);
            
    }
}