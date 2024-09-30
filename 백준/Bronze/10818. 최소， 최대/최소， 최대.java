import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 1000000, max = -1000000;
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
            if(min > array[i])
                min = array[i];
            if(max < array[i])
                max = array[i];
        }
        System.out.printf("%d %d", min, max);
    }
}