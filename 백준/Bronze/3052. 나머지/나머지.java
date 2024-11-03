import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0, res = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = in.nextInt()%42;
            for(int j = 0; j < i; j++)
                if(arr[j] != arr[i])
                    cnt++;
            if(cnt == i)
                res++;
            cnt = 0;
        }
        System.out.print(res);
    }
}