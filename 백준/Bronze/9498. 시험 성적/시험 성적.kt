import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    var res = when{
        num >= 90 -> "A"
        num >= 80 -> "B"
        num >= 70 -> "C"
        num >= 60 -> "D"
        else -> "F"
    }
    print(res)
}