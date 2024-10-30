import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var arr = IntArray(sc.nextInt(),{0})
    for(i in 0..arr.size-1){
        arr[i] = i+1
    }
    for(i in 1..sc.nextInt()){
        val a = sc.nextInt()-1; val b = sc.nextInt()-1
        var temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
    }
    arr.forEach { print("$it ") }
}