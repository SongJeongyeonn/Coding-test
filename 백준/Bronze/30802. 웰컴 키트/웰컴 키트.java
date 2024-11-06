import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int[] num = new int[6];
        for(int i = 0; i < 6; i++)
            num[i] = in.nextInt();
        int n = in.nextInt(), cnt = 0;
        for(int i = 0; i < 6; i++){
            cnt += num[i]/n;
            if(num[i]%n != 0){
                cnt++;
            }
            num[i]-=n;
        }
        n =in.nextInt();
        System.out.printf("%d\n%d %d", cnt, p/n, p%n);
    }
}