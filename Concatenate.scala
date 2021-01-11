package Recursion

// CONCATENATE A STRING N TIMES

object Concatenate {
  def ConcatenateString(aString:String, n: Int, accumulator:String):String =
    if(n<=0) accumulator
    else ConcatenateString(aString, n-1, aString+accumulator)


  def main(args: Array[String]): Unit = {

    println(ConcatenateString("Hello", 3, "  "))

  }
}
