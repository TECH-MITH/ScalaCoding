package Recursion

import scala.annotation.tailrec

object IsPrimeTailRec {
  def isPrime(n:Int):Boolean= {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)

  }

  def main(args: Array[String]): Unit = {
    println(isPrime(2003))
    println(isPrime(301))
  }
}
