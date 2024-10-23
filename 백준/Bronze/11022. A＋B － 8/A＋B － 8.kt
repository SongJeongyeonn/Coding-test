import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    for(i in 1..(sc.nextInt())){
        var a = sc.nextInt(); var b = sc.nextInt()
        println("Case #${i}: ${a} + ${b} = ${a+b}")
    }
}