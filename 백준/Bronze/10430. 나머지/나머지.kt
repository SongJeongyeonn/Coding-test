import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt(); var b = sc.nextInt(); var c = sc.nextInt()
    print("${(a+b)%c}\n${((a%c)+(b%c))%c}\n${(a*b)%c}\n${((a%c)*(b%c)%c)}")
}