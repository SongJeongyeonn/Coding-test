import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var arr = IntArray(sc.nextInt(),{0})
    for(i in 0..(arr.size-1)){
        arr[i] = i+1
    }
    for(i in 1..sc.nextInt()){
        var a = sc.nextInt()-1; var b = sc.nextInt()-1
        for(j in 0..(b-a-1)/2){
            var tmp = arr[a+j]
            arr[a+j] = arr[b-j]
            arr[b-j] = tmp
        }
    }
    arr.forEach { print("$it ") }
}