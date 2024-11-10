import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    for(i in 1..sc.nextInt()){
        val s = sc.next()
        println(s[0]+""+s[s.length-1])
    }
}