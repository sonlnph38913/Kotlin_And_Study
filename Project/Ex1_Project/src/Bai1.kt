fun main(args: Array<String>) {
    println("Hello")
    //Buổi 1: Khai Báo Biến
    var y : Double = 8.5
    var z = 10.75
    println("Kiểu Loại Dữ Liệu Của y là : " + (y::class.java.typeName))
    println("Kiểu Loại Dữ Liệu Của z là : " + (z::class.java.typeName))

    var k : Float = 7.5f
    println("Kiểu Loại Dữ Liệu Của k là : " + (k::class.java.typeName))

    var soA : Int = 13
    var soB = 15
    println("Kiểu Loại Dữ Liệu Của số B là : " + (soB::class.java.typeName))

    var soC : Long = 10000L
    var soD = 15L
    println("Kiểu Loại Dữ Liệu Của soC là : " + (soD::class.java.typeName))

    var kyTu : Char = 'L'
    var str1 : String = "Le nam Son"
    var str2 = "Lê Nam Sơn"
    println("Kiểu Loại Dữ Liệu Của str2 là : " + (str2::class.java.typeName))
    //khai báo đoạn
    var str3 = """
        Anh thật ghét cái chốn đông người
        Vừa bảo ta hai đứa xứng đôi
        Mình vẫn hai người lại bảo ta không phải một đôi
    """.trimIndent()
    println(str3)
    //khai báo bool
    var check1 : Boolean = true
    var check2 : Boolean = false
    //khai báo mảng
    var mangSoThuc : FloatArray = floatArrayOf(2.5f,10f,45f)
    var mangKiTu : CharArray = charArrayOf('a','b','c')

    //khai báo hằng val
    val nhietDoSoi : Int = 100
  //lỗi thay đổi hằng số:  nhietDoSoi = 150
}