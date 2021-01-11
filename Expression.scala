package lectures.part1basic

object Expression extends App {
  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 4 * 5)
  //+ - * / & | << >> >>> (right shift with zero expression)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=.... side effect
  println(aVariable)

  // Instruction (do) vs Expressions (Value)

  // IF expression
  val aCondition=true
  val aConditionedValue=if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i=0
  while (i<10)
  {
    println(i)
    i+=1
  }
  //NEVER WRITE THIS AGAIN

  //EVERYTHING in scala is an expression

  val aWeiredValue=(aVariable=3) // Unit ===
  println(aWeiredValue)

  //side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock ={
    val y=4
    val z=y+1

    if(z >2) " Hello " else " Goodbye"

  }

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986 // THIS statement is irrelevant here
    45
  }
  println(someOtherValue)



}

