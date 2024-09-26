import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        int f = in.nextInt();
        for(int i = 0; i < n; i++){
            if(array[i] == f)
                cnt++;
        }
        System.out.printf("%d",cnt);
    }
}