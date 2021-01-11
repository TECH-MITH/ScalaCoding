package excercises

object TupleA extends App{
  val myTuple = (1,2,"Hye", true)
  val myTuple2 = Tuple3(1,2,"Bye")
  val myTuple3 = Tuple3(1,"Hello", (2,3))
  println(myTuple)
  println(myTuple._1)
  println(myTuple._2)
  println(myTuple._3)
  println(myTuple3._3)

  myTuple.productIterator.foreach{
    i => println(i)
  }

  println(1 -> "Tom" -> true)
  println(myTuple3._3._2)



}
