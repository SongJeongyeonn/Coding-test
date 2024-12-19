import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] major = new int[6];
        int i, sum = 0;
        for(i = 0; i < 6; i++)
            major[i] = in.nextInt();
        int n = major[0];
        for(i = 1; i < 4; i++){
            if(n > major[i]){
                sum += n;
                n = major[i];
            } else{
                sum += major[i];
            }
        }
        n = major[4] > major[5] ? major[4] : major[5];
        sum += n;
        System.out.print(sum);
    }
}