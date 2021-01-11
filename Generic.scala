package lectures.part2oop

object Generics extends App{

  class MyList[+A]{
    // use type A
    def add[B >: A](element: B): MyList[B] = ???

    /*
     A= cat
     B= Animal
     */
  }
  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }
  val emptyListIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //Q.1 does list[cat] animal extends list[Dog] animal
  //A1 - yes, List[Cat] extends List [Dog] = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianceList[Animal] = new CovarianceList[Cat]
  // animalList.add(new Dog)-- we returns list of animals

  // 2. NO= INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell,no! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  // Bounded type- allow to use ur generic classes only for certain type that are either the sub class or super class different type
  class Cage[A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

  //class Car
  //val newCage = new Cage(new Car)


  // expand MyList to be generic
}
