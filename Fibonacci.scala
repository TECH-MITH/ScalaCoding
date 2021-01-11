package Recursion

import scala.annotation.tailrec

object Fibonacci {

  def fibonacci(n:Int):Int ={
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast:Int):Int =
      if(i>=n) last
      else fiboTailrec(i+1,last+nextToLast, last)

    if(n<=2) 1
    else fiboTailrec(2, 1, 1)

  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(8))
    // 1 1 2 3 5 8 13 21

  }
}
