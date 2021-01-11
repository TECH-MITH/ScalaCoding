package excercises

object MapA extends App{
  var myMap = Map(26 -> "Kelly",23 -> "Tom", 25 -> "July")
  var myMap2 = Map(23 -> "Love", 45 -> "Ram", 50 -> "Tony")
  println(myMap)
  println(myMap(23))
  println(myMap.keys)
  println(myMap.values)
  println(myMap.isEmpty)

  myMap.keys.foreach{ key =>
    println("key " + key)
    println("value " + myMap(key))

    println(myMap ++ myMap2)

  }
}
