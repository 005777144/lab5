Q2)
fun main(args: Array<String>) {
var age = 7
when(age) {
in 0..20 -> println("Family")
in 60..100 -> println("Senior")
else -> println("Normal")
}
}