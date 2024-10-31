import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int tmp, i;
        for(i = 0; i < arr.length; i++){arr[i] = i+1;}
        int n = in.nextInt();
        for(i = 1; i <= n; i++){
            int a = in.nextInt()-1, b = in.nextInt()-1;
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        for(i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}