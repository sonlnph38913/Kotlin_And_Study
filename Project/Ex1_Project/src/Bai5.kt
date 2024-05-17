fun main(args: Array<String>) {
    var a = 10
    var b = 3

    //phép cộng
    println("a + b = " + (a + b))
    println("a + b = " + (a.plus(b)))

    //phép trừ
    println("a - b = " + (a - b))
    println("a - b = " + (a.minus(b)))

    //phép nhân
    println("a * b = " + (a * b))
    println("a * b = " + (a.times(b)))

    //phép chia

    println("a / b = " + (a / b))
    println("a / b = " + (a.div(b)))
    var ketQua : Float = a.toFloat()/b
    println(ketQua)

    //phép chia ấy dư
    println("a % b = " + (a % b))
    println("a % b = " + (a.rem(b)))
}