import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var big = -1000000; var sma = 1000000
    for(i in 1..sc.nextInt()){
        var n = sc.nextInt()
        if(big < n)
        big = n
        if(sma > n)
        sma = n
    }
    print("$sma $big")
}