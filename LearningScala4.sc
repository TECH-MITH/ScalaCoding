// Data structures

// Tuples
// Immutable lists

val captainStuff = ("Picard", "Entertainment", "NCC-1701-D")
println(captainStuff)

// Refer to the individual fields with a ONE-BASED index
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picards = "Picard" -> "Entertainment"
println(picards._2)
val aBunchOfStuff = ("Kirk", 1998, true)

// Lists
// Like a tuple, but more functionality
// Must be of same type

val shipList = List("enterprise", "Define", "voyager", "Depp")

println(shipList(1))
// zero-based

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {println(ship)}

val backwardShips = shipList.map( (ship: String) => {ship.reverse})
for (ship <- backwardShips) {println(ship)}

// reduce() to combine together all the items in a collection using s
val numberList = List(1,2,3,4,5)
val sum = numberList.reduce( ( x:Int, y: Int) => x+y)
println(sum)

// filter() remove stuff
val iHateFive = numberList.filter((x: Int) => x !=5)
val iHateThree = numberList.filter(_!=3)

// concatenate lists
val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted = reversed.sorted
val lotsOfDuplicates = numberList ++ numberList
val distinctValue = lotsOfDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hashThree = iHateThree.contains(3)

//Maps
val shipMap = Map("Kirk" -> "Entertainment", "Picard" -> "entertainment")
println(shipMap("Kirk"))
println(shipMap.contains("Picard"))
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archersShip)

