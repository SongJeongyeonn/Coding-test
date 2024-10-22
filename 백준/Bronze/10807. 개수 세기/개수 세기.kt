import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var num = sc.nextInt()
    var arr = IntArray(num, {0})
    var cnt = 0
    for(i in 0..(num-1))
    arr[i] = sc.nextInt()
    var find = sc.nextInt()
    for(i in 0..(num-1))
    if(arr[i] == find)
    cnt++
    print(cnt)
}