import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    for(i in 1..(sc.nextInt()))
    println("Case #${i}: ${sc.nextInt() + sc.nextInt()}")
}