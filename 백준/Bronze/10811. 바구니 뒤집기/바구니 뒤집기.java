import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int tmp = 0, num = in.nextInt();
        for(int i = 0; i < arr.length; i++)
            arr[i] = i+1;
        for(int i = 1; i <= num; i++){
            int a = in.nextInt()-1, b = in.nextInt()-1;
            for(int j = 0; j <= (b-a-1)/2; j++){
                tmp = arr[a+j];
                arr[a+j] = arr[b-j];
                arr[b-j] = tmp;
            }
        }
        for(int x:arr)  System.out.printf("%d ", x);
    }
}