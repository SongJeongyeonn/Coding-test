import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res, cnt;
        for(int i = 0; i < num; i++){
            String ox = in.next();
            char[] arr = ox.toCharArray();
            res = 0;
            cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 'O'){
                    cnt++;
                    res += cnt;
                }
                else
                    cnt = 0;
            }
            System.out.println(res);
        }
    }
}