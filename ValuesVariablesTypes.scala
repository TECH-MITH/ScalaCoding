
package lectures.part1basic

object ValuesVariablesTypes extends App{
  val x:Int=52
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String="Heloo"
  val anotherString="mithilesh"

  val aBoolean: Boolean=false
  val aChar: Char='a'
  val anInt: Int=x
  val aShort:Short=456
  val aLong:Long=1212241L
  val aFloat:Float=1.2f
  val aDouble:Double=3.14

  //Variables
  var aVariables:Int=8

  aVariables=5 //side affects

}
