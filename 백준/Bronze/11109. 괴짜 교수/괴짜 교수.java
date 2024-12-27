import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        while(size > 0){
            String m = "does not matter";
            int d = in.nextInt(), n = in.nextInt(), s = in.nextInt(), p = in.nextInt();
            if(p*n+d > s*n)
                m = "do not parallelize";
            else if(p*n+d < s*n)
                m = "parallelize";
            System.out.println(m);
            size--;
        }
    }
}