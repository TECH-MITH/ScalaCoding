package excercises

object Array extends App{
  val array = new Array[Int](4)
  val array2 = new Array[Int](5)

  array(0) = 10
  array(1) = 20
  array(2) = 30
  array(3) = 40
  println(array)
  for(x <- 0 to  (array.length - 1)) {
    println(x)
  }

}
