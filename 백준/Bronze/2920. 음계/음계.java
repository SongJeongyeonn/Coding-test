import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
        int[] num = new int[8];
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < 8; i++){
            num[i] = in.nextInt();
            if(num[i] == i+1)
                cnt1++;
            else if(num[i] == 8-i)
                cnt2++;
        }
        if(cnt1 == 8)
            res = "ascending";
        else if(cnt2 == 8)
            res = "descending";
        else
            res = "mixed";
        System.out.print(res);
    }
}