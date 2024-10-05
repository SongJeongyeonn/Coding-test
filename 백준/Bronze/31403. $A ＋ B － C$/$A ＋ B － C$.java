import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String[] arr = new String[3];
	        for(int i = 0; i < 3; i++){
	            arr[i] = in.nextLine();
	        }
	        int sum2 = Integer.parseInt(arr[0]+arr[1])-Integer.parseInt(arr[2]);
	        int sum1 = Integer.parseInt(arr[0])+Integer.parseInt(arr[1])-Integer.parseInt(arr[2]);
	        System.out.printf("%d\n%d",sum1,sum2);
	    }
}