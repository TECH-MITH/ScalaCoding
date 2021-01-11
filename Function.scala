package lectures.part1basic

object Function  extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
    // println(aFunction("hello", 3))
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)

  }

  println(aRepeatedFunction("Hello", 3))

  //WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit= println(aString)

  def aBigFunction(n: Int): Int ={
    def aSmallFunction(a: Int, b:Int): Int =a+b
    aSmallFunction(n, n-1)
  }
  /*
  1. A greeting function (name, age) => "Hi my name is mithilesh and i'm 22 year old
  */
  def aFunction1(name:String, age:Int):String =
    "hi,my name is" + name+ "and i'm' " +age+ " year old "

  println(aFunction("mithilesh  ", 22 ))
  /*
  2. Factorial function 1*2*3*...n
   */
  def factorial(n:Int):Int=
    if(n<=0) 1
    else n*factorial(n-1)
  println(factorial(5))

  /*
  3. A Fibonacci function
     f(1)=1
     f(2)=1
     f(n)=f(n-1)+ f(n-2)
   */

  def fibonacci(n: Int): Int=
    if(n<=2) 1
    else fibonacci(n-1)+fibonacci(n-2)
  println(fibonacci(8))



  /*
4. Test if a number is prime
 */
  def isPrime(n: Int):Boolean={
    def isPrimeUntil(t: Int): Boolean =
      if(t<=1) true
      else n% t!=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(222))
  println(isPrime(37*17))
}



