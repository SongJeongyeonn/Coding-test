import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var res = when{
        a > b -> ">"
        a < b -> "<"
        else -> "=="
    }
    print(res)
}