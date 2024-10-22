import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var a = sc.nextInt(); var b = sc.nextInt()
    var res : Int = a*b
    while(b > 0){
        println(a * (b%10))
        b = (b-b%10)/10
    }
    print(res)
}