import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    var n = sc.nextInt()
    for(i in 0..(num-1)){
        var a = sc.nextInt()
        if(a < n)
        print("$a ")
    }
    
}