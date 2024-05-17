fun main(args: Array<String>) {
    var soA : Int = 35
    var soB : Long = soA.toLong()
    //kt kiểu Loại
    println("kiểu loại số A :" + soA ::class.java.typeName)
    println("kiểu loại số B :" + soB ::class.java.typeName)
    println(soA)
    println(soB)

    //ép kiểu hẹp
    var x :Short = 32767 //giá trị lớn nhất short lưu trữ được là 32767
    var y : Byte = x.toByte() //byte nhận giá trị từ -128 -> 127
    println("x = $x")
    println("y = $y")

    //ví dụ 2
    var m : Short = 120
    var n : Byte = m.toByte()
    println("m = $m")
    println("n = $n")

    //ví dụ 3
    var diemToan:Float = 9.5f
    var diemVan :Int = diemToan.toInt()
    println("Điểm toán : $diemToan")
    println("Điểm Văn : $diemVan")

}