fun main(args: Array<String>) {
    val a: Int = 10000
    println("a Apakah Identik dengan a atau a === a : " + (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA  Apakah Identik dengan AnotherBoxedA atau boxedA === anotherBoxedA : " +
            (boxedA === anotherBoxedA))
    println("boxedA Apakah Memiliki Nilai Yang Sama dengan AnotherBoxedA atau boxedA == AnotherBoxedA: " +
            (boxedA == anotherBoxedA))
}