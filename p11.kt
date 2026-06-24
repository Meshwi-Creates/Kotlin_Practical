fun main(){

    var a: Int
    a=22
    var b: Float
    b= 1.5F
    var c: Char
    c= 'T'
    var d: String
    d="HHH"
    var e: Boolean
    e=false
    var f: Double
    f=96.36
    var g: Long
    g=338927847
    var h: Short
    h=-2
    var i: Byte
    i=127

    println("Integer value="+a)
    println("Floaat Value="+b)
    println("Character Value="+c)
    println("String value="+d)
    println("Boolean value="+e)
    println("Double value="+f)
    println("Long Value="+g)
    println("Short Value="+h)
    println("Byte value="+i)

    //different ways to print values
    println("Char value="+c)
    println("Char value=$c")
    println("sum of a and b= ${a+b}")
    println(String.format("character: %c, int: %d", c, a))
}
