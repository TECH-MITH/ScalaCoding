package lectures.part1basic

import scala.annotation.tailrec
object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of" + n + "- I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of" + n)

      result
    }

  println(factorial(100))
  // println(factorial(5000))


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call at the last expression
    factHelper(n, 1)
  }

  /*
  anotherFactorial(10)=factHelper(10,1)
  = factHelper(9, 10*1)
  = factHelper(8, 9*10*1)
  = factHelper(7, 8*9*10*1)
  =....
  = factHelper(2, 3*4*......*10*1)
  = factHelper(1, 2*3*4*.....*10)
  = 1*2*3*4*...*10
   */
  println(anotherFactorial(5000))

  // Q. how do i iterate when recursion is limited
  // A. WHEN YOU NEED LOOPS, USE_TAIL_RECURSION

  //Q 1. CONCATENATE A STRING N TIMES
  @tailrec
  def ConcatenateTailrec(aString:String, n: Int, accumulator:String):String =
    if(n<=0) accumulator
    else ConcatenateTailrec(aString, n-1, aString+accumulator)

  println(ConcatenateTailrec("Hello", 3,""))

  //Q 2. ISPRIME FUNCTION TAIL RECURSIVE
  def isPrime(n:Int):Boolean= {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)


  }
  println(isPrime(200))
  println(isPrime(3002))

  //Q 3. FIBONACCI FUNCTION, TAIL RECURSIVE

  def fibonacci(n:Int):Int ={
    @tailrec
    def fiboTailrec(i: Int, last: Int,nextToLast:Int):Int =
      if(i>=n) last
      else fiboTailrec(i+1,last+nextToLast, last)

    if(n<=2) 1
    else fiboTailrec(2, 1, 1)


  }
  println(fibonacci(8))
  // 1 1 2 3 5 8 13 21
}
