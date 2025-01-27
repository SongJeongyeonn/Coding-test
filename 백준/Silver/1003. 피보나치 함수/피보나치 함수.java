import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        while(size > 0){
            int n = in.nextInt();
            int[] num1 = new int[n+1];
            int[] num2 = new int[n+1];
            num1[0] = 1; num2[0] = 0;
            if(n > 0){
                num1[1] = 0; num2[1] = 1;

                for(int j = 2; j<=n; j++){
                    num1[j] = num1[j-1]+ num1[j-2];
                    num2[j] = num2[j-1]+ num2[j-2];
                }
            }
            System.out.printf("%d %d\n", num1[n],num2[n]);
            size--;
        }
    }
}