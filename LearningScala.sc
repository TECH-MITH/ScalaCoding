// VALUES are immutable  constants
val hello: String = " Hello "

// variable are mutable
var helloThere: String = hello
helloThere = hello + " There! "
println(helloThere)

// Data types

val numberOne: Int = 1
val truth: Boolean = true
val pi: Double = 3.145
val piSinglePrecision: Float = 3.141590f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Hello is mess: " + numberOne + truth + pi +smallNumber + bigNumber )

println(f"pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variable like $numberOne")

val theUltimateAnswer: String = "to life, the universe,and everything is 42"
val pattern = """.*([\d]+.*)""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

// Boolean
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater || isLesser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain

