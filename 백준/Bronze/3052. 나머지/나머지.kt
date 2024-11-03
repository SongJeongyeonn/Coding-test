import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var arr = IntArray(10,{0})
    var cnt = 0; var res = 0;
    for(i in 0..9){
        arr[i] = sc.nextInt()%42
        for(j in 0..(i-1)){
            if(arr[j] != arr[i])
            cnt++
        }
        if(cnt == i)
        res++
        cnt = 0
    }
    print(res)
}