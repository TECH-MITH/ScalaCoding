package excercises

object HOF extends App{
  def math(x:Double, y:Double, z:Double, f: (Double,Double) => Double):Double = f(f(x,y),z)
    val result = math(50,30,40, _+_)
  println(result)

  def Math(x:Int, y:Int, z:Int, f:(Int, Int)=>Int):Int = f(f(x,y),z)
  println(Math(20, 30, 50 ,_+_))


}
