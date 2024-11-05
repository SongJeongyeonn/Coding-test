import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var arr = DoubleArray(sc.nextInt(), {0.0})
    var big = 0.0; var sum = 0.0
    for(i in 0..(arr.size-1)){
        arr[i] = sc.nextDouble()
        if(big < arr[i])
            big = arr[i]
    }
    for(i in 0..(arr.size-1))
        sum += arr[i]/big*100
    println(sum/arr.size)
}