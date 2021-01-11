package excercises

object ListExample extends App{
  val aList=  List(1,2,3,4)
  val name = List("Max", "Tom", "John")
    println(0 :: aList) // :: ->cons
    println(name)
  println(1 :: 5 :: 9 :: Nil)
  println(aList.head)
  println(aList.tail)
  println(name.head)
  println(name.tail)
  println(name.isEmpty)
  println(aList.reverse)
  println(List.fill(3)(1))
  println(aList.max)

  aList.foreach(println)
  var sum:Int = 0
  aList.foreach((sum+=_))
  println(sum)

  for(name <- name) {
    println(name)

  }
  println(name(0))



}
