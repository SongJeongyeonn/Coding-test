import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var sum = 0;
    for(i in 1..(n))
    sum+=i
    print(sum)
}