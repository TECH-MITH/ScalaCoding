package lectures.part2oop


import java.util.Date
import java.sql.{Date => SqlDate}

import playground.{PrinceCharming, cinderella => Princess}
object PackagingAndImports extends App{

  // package methods are accessible by their similar name
  val writer = new Writer("Mithilesh"," Rock the jvm",  2020)

  // import the package
  val princess= new Princess // playground.cinderella = fully qualified name

  // package are in hierarchy
  // matching folder structure

  sayHello
  println(SPEED_OF_LIGHT)

  //import
  val prince = new PrinceCharming

  // 1. use FQ names
  val date = new Date
  val SqlDate = new SqlDate(2020, 4 ,3)

  // default imports
  // java.lang - String, Object, Exception
  //Scala - Int, Nothing, Function
  // scala.predef - println , ???
}
