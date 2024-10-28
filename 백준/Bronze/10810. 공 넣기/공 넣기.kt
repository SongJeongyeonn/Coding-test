import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val arr = IntArray(sc.nextInt(), {0})
    for(i in 1..sc.nextInt()){
        var a = sc.nextInt()-1; var b = sc.nextInt()-1
        var n = sc.nextInt()
        for(j in a..b)
            arr[j] = n
    }
    arr.forEach { print("$it ") }
}