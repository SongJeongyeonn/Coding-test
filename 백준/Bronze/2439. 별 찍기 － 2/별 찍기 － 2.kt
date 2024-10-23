import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    for(i in 1..(n)){
        for(j in 1..(n-i))
        print(" ")
        for(j in 1..(i))
        print("*")
        println()
    }
}