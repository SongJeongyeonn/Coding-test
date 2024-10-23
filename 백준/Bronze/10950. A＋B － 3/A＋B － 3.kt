import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    for(i in 1..(num)){
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a+b)
    }
}