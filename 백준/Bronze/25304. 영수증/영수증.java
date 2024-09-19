import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int m = in.nextInt();
	      int n = in.nextInt();
	      for(int i = 0; i < n; i++){
	          m = m -(in.nextInt()*in.nextInt());
	      }
	      if(m != 0)
	          System.out.print("No");
	      else
	          System.out.print("Yes");
    }
}