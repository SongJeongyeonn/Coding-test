import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    for(i in 1..(sc.nextInt())){
        for(j in 1..(i))
        print("*")
        println()
    }
}