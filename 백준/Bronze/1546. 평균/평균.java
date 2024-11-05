import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] arr = new double[in.nextInt()];
        double big = 0.0, sum = 0.0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextDouble();
            if(big < arr[i])
                big = arr[i];
        }
        for(int i = 0; i <arr.length; i++){
            sum += arr[i]/big*100;
        }
        System.out.print(sum/arr.length);
    }
}