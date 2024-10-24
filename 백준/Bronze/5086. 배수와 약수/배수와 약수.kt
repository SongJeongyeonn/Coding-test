import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    while(true){
        var a = sc.nextInt()
        var b = sc.nextInt()
        if(a == 0 && b == 0){
            break;
        }
        else{
            var s = when{
            b%a == 0 -> "factor"
            a%b == 0 -> "multiple"
            else -> "neither"
            }
            println(s)
        }
    }
}