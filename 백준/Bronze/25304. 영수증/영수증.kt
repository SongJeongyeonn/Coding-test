import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var m = sc.nextInt()
    var n = sc.nextInt()
    for(i in 1..(n))
    m -= (sc.nextInt() * sc.nextInt())
    if(m == 0)
    print("Yes")
    else
    print("No")
}