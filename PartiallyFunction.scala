package excercises

import java.util.Date

object PartiallyFunction extends App {
    def log(date: Date, message: String) =
    println(date + " " + message)

    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val fun = sum(10, _: Int, _: Int)
    println(fun(100, 200))

    val date = new Date
    val newLog = log(date, _: String)
    println("Message")

}
