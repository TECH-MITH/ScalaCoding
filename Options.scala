package lectures.part3FP

import scala.util.Random

object Options extends App{
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  //  WORK with unsafe APIs
  def unsafeMethod(): String = null
  // val result = Some(null) // WRONG
  val result = Option(unsafeMethod()) // Some or None
  println(result)

  // chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))

  // Design unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainResult = betterBackupMethod() orElse betterBackupMethod()

  // functions on Options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get)  // UNSAFE- DO NOT USE THIS

  // map, flatMap, filter
  println(myFirstOption.map(_*2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))

  // for comprehensions

  /*
  Exercise
   */

  val config: Map[String, String] = Map(
    // fetched from elements
    "host" -> "176.45.36.1",
    "port" -> "80"

  )

  class Connection {
    def connect = "Connected" // connect to some server

  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port:String): Option[Connection] =
      if(random.nextBoolean()) Some(new Connection)
      else None
  }
  //try  to establish a connection , if so - print hte connect method
  val host = config.get("host")
  val port = config.get("port")
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h,p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)

}
