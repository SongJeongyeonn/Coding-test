import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String rank = "Junior";
            String name = in.next();
            int age = in.nextInt();
            int weight = in.nextInt();
            if(name != "#" && age != 0 && weight != 0){
                if(age > 17 || weight >= 80)
                    rank = "Senior";
                System.out.printf("%s %s\n", name, rank);
            }else
                return;
        }
    }
}
