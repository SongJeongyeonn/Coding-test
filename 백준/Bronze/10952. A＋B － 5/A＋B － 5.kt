import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    while(true){
        var n = sc.nextInt() + sc.nextInt()
        if(n == 0)
        break
        println(n)
    }
}