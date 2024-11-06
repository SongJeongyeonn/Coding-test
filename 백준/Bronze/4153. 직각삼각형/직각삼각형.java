import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        int tmp;
        while(true){
            arr[0] = in.nextInt(); arr[1] = in.nextInt(); arr[2] = in.nextInt();
            if(arr[0] == 0 && arr[0] == arr[1] && arr[1] == arr[2]){
                break;
            }
            for (int i = 0; i < 3; i++) {
                if(arr[2] < arr[i]){
                    tmp = arr[2];
                   arr[2] = arr[i];
                   arr[i] = tmp;
                }
            }
            if(arr[2]*arr[2] == arr[0]*arr[0]+arr[1]*arr[1])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}