import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    for(i in 1..9){
        println("$num * $i = ${num*i}")
    }
}