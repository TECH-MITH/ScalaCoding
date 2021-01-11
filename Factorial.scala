package Recursion

import scala.annotation.tailrec

// Creating object
object Factorial {
  // Function define
  def fact(n: Int): Int = {
    if (n <= 1) 1
    else n * fact(n - 1)
  }
  // Main method
  def main(args: Array[String]) {
    println(fact(10))
    //println(fact(3000)
    println(AnotherFact(5000))
  }

  def AnotherFact(n:Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = // auxiliary function
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call at the last expression
    factHelper(n, 1)
  }

}

/*
  anotherFact(10)=factHelper(10,1)
  = factHelper(9, 10*1)
  = factHelper(8, 9*10*1)
  = factHelper(7, 8*9*10*1)
  =....
  = factHelper(2, 3*4*......*10*1)
  = factHelper(1, 2*3*4*.....*10)
  = 1*2*3*4*...*10
   */
