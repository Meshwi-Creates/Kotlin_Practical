fun main(){
    println("enter a number")
    var num = readln().toInt()
    println("factorial $num = ")
}
fun factorial(n: Int): Int {
    return n * factorial(n-1)
}