package edu.knoldus

object Main extends App {

  val tailRecursion = new TailRecursion()
  val list = List(1, 3, 5)
  val set = Set(1, 2, 3, 4, 5, 6, 7, 8)
  println(tailRecursion.getLength(list))
  println(tailRecursion.getLengthSet(set))

}
