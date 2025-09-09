fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //Konversi Implisit
    println("Konversi Variabel valInt Secara Implisit : " + valSum)
    val valLong: Long = valInt.toLong() // Konversi Eksplisist
    println("Konversi Variabel valInt Secara Eksplisit : " + valLong)
}