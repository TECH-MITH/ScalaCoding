package excercises
// sets are mutable kinds of collection
object SetsA extends App{
  val aSet = Set(1,2,3,4,4,5)
  val aSet2 = Set(4,5,7,9,10,12)
  val aName = Set("Lee","Love","Priya")
  println(aSet + 6)
  println(aName)
  println(aName("Max"))
  println(aSet.head)
  println(aSet.tail)
  println(aSet.isEmpty)

  println(aSet2 ++ aSet)

  println(aSet.&(aSet2))
  println(aSet.intersect(aSet2))
  println(aSet.max)

  println(aSet.min)
  aSet.foreach(println)

  for (name <- aName) {
    println(aName)
  }

}
