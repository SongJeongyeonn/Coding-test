import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int n = in.nextInt();
        System.out.print(m.toCharArray()[n-1]);
    }
}