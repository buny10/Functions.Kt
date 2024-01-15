//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
   val max = getMax(5,9)
    println(max)


}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max

}