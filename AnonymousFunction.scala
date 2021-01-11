package lectures.part3FP

object AnonymousFunction extends App {
  // anonymous function (LAMBDA)
  val doubler:Int => Int = (x: Int) => x*2

  //multiple params in a lambda
  val adder: (Int, Int) =>Int = (a: Int, b:Int) => a+b

  // no params
  val justDoSomething:() => Int = () => 3

  println(justDoSomething)
  println(justDoSomething())

  // curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrement:Int => Int = _ + 1 // equivalent to x=> x+ 1
    val niceAdder: (Int, Int) => Int = _+_ // equivalent to (a,b) => a + b

  /*
  1. MyList: replace all FunctionX calls with lambda
  2. Rewrite the "special" adder as an anonymous function
   */

  val superAdd = (x: Int) => (y: Int) => x+ y
  print(superAdd(3)(4))
}
