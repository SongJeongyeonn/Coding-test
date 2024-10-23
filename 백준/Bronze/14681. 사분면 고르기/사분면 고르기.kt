import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var x = sc.nextInt(); var y = sc.nextInt()
    var res = when{
        x > 0 && y > 0 -> 1
        x > 0 -> 4
        y > 0 -> 2
        else -> 3
    }
    print(res)
}