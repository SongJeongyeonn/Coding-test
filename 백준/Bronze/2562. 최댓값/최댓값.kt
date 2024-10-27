import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var big = 1; var index = 0
    for(i in 1..9){
        var n = sc.nextInt()
        if(big < n){
            big = n
            index = i
        }
    }
    print("$big\n$index")
}