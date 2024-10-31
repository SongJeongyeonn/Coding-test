import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            int a = in.nextInt()-1, b = in.nextInt()-1;
            int v = in.nextInt();
            for(int j = a; j <= b; j++){
                arr[j] = v;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}