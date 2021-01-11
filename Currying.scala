package excercises

object Currying extends App{
  def add(x:Int, y:Int) = x + y
  def add2(x:Int) = (y:Int) => x + y
  def add3(x:Int) = (y:Int) => x + y
  println(add(20, 10))
  println(add2(30)(40))
  val sum40 = add2(40)
  println(sum40(50))
  println(add3(500)(300))
  val sum30 = add3(50)
  println(sum30(400))

}
