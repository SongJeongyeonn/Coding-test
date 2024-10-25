import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt(); var k = sc.nextInt()
    var cnt = 0;
    for(i in 1..n){
        if(n%i == 0){
            if(++cnt == k){
                print(i)
                break
            }
        }
    }
    if(cnt != k)
    print("0")
}