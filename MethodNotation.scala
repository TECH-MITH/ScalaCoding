
package lectures.part2oop

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int=0)  {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String ): Person = new Person (s"$name ($nickname)",favoriteMovie)
    def unary_! : String = s" $name, what the heck!"
    def unary_+ : Person = new Person (name, favoriteMovie, age + 1 )
    def isAlive : Boolean = true
    def apply(): String  = s"Hi , my name is $name and i like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String ) =s"$name is learning $thing "
    def learnsScala = this learns " Scala"

  }

  val mary = new Person("Marry", "Inception")
  println(mary.likes("Inception"))
  println(mary likes " Inception") // equivalant
  // infix notation = operator notation notation (syntactic sugar

  // "operator " in scala
  val tom = new Person("Tom", "Fight club")
  println(mary + tom)

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // Akka actors have 1

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_prefix only  works with - + !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary.isAlive)

  // apply
  println(mary.apply())
  println(mary())// equivalent

  /*
  1. Overload the + operator
      mary + "the rockstar" => new person " Mary (the rockstar)"

   */

  /*
  2. Add an age to the Person class
     add a unary + operator => new person with the age + 1
     +mary => mary with the age incrementer
   */

  /*
  3. Add a " learns" method in the Person class => " mary learns scala"
     Add a learnsScala method, calls learns method with "Scala"
     Use it in postfix notation.

   */

  /*
 4. Overload the apply method
  mary.apply(2) => " Mary watched Inception 2 times"
   */

  println((mary + " The Rockstar").apply())
  println((+mary).age)
  println(mary.learnsScala)
  println(mary(10))

}




