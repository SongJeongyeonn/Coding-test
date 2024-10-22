import java.util.Scanner;
fun main(){
    val sc = Scanner(System.`in`)
    var y = sc.nextInt()
    var res = if((y % 4 == 0 && y % 100 != 0)||(y % 400 == 0))
    1
    else
    0
    print(res)
}