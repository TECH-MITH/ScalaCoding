

package lectures.part1basic

object StringOps  extends App{
  val str: String=" Hello, i am learning scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" " ).toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","_"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString="45"
  val aNumber= aNumberString.toInt
  println('a'+: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scalla-specification: String interpolators

  //s-interpolators
  val name="Mithilesh"
  val age=22
  val greeting =s" Hello, my name  $name and I am $age  years old"
  val anotherGreeting=s"Hello, my name is $name and I will be turn ${age+1} years old "
  println(anotherGreeting)

  //F-interpolators
  val speed=1.2f
  val String=f"$name can eat $speed%2.2f burger per minute"
  println(String)

  // raw-interpolators
  println(raw"This is a \n newline")
  val escaped="This is a \n newline"
  println(raw"$escaped")
}
