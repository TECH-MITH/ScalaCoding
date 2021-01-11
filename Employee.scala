package excercises

class Employee (var name: String, var salary:Int) {


}
object Main {
 def main (args: Array[String]): Unit = {
    var emily = new Employee("Emily", 10000)
    println(emily.name)
   println(emily.salary)
   emily.salary=20000
   println(emily.salary)
  }
}
