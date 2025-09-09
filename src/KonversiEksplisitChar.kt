fun main(args: Array<String>) {
    //ASCII value
    var c: Char // Character
    var i: Int // ordinal (ASCII) value of the character
    // conversion from text to ASCII value
    c = 'a'
    i = c.toInt()
    println("The Character $c Was Converted to its ASCII value of $i")

    // conversion from an ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII Value Of $i Was Converted to Its Textual Value of $c")


}