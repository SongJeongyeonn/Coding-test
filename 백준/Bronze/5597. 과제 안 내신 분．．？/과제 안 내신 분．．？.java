import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i = 1; i <= 28; i++){
            arr[in.nextInt()-1]++;
        }
        for(int i = 0; i < 30; i++){
            if(arr[i] == 0)
                System.out.println(i+1);
        }
    }
}