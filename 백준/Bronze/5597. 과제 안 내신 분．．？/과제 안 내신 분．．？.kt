import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val arr = IntArray(30,{0})
    for(i in 0..27){
        arr[sc.nextInt()-1]++;
    }
    for(i in 0..29)
        if(arr[i] == 0)
            println(i+1)
}