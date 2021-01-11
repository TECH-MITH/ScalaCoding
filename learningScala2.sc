// Flow control

// If/ else:
if (1>3) println("impossible!") else println("the world makes sens")

if (1 > 3) {
  println("Impossible!")
  println("Really?")

}else {
  println("The world makes sense.")
  println("still.")
}

// Matching
val number = 2
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("something else")
}

for( x <- 1 to 4) {
  val square = x * x
  println(square)
}

var x = 10
while (x>=0) {
  println(x)
  x -=1
}

x = 0
do { println(x); x+=1} while (x <= 10)

// Expression

{val x = 10; x+20}

println({val x = 10; x+20})


def fib1(n:Long):Long = n match{
  case 1 | 1 => n
  case _ => fib1(n-1)+fib1(n-2)
}
