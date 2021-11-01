package edu.knoldus

import scala.annotation.tailrec

class TailRecursion {
  @tailrec
  final def getLength(list: List[Int], accu: Int = 0): Int = {
    list match {
      case Nil          => accu
      case head :: tail => getLength(tail, 1 + accu)
    }
  }

  @tailrec
  final def getLengthSet(set: Set[Int], acc: Int = 0): Int = {
    set.toList match {
      case Nil          => acc
      case head :: tail => getLengthSet(tail.toSet, 1 + acc)
    }
  }

}
