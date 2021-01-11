package lectures.part2oop

object CaseClasses  extends App{
  /*
   equals, hashCode, toString
   */

  case class Person(name:String, age:Int)

  //1. class parameters are field
  val jim = new Person("Jim", 25)
  println(jim.name)

  //2. sensible toString
  // println(instance) = println(instance.toString) //syntactic sugar
  println(jim)

  //3. equals and hashCode implemented OOTB
  val jim2=new Person("jim", 35)
  println(jim==jim2)

  // 4. CCs have habdy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 24)

  // 6. CCs are serializable
  //Akka

  //  7. CCs have extractor patterns = CCs can be used to PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = " The UK of GB and NI"
  }

  /*
  Expand MyList = use case classes and case objects
   */
 }
