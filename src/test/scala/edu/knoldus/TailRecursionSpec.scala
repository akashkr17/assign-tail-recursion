package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class TailRecursionSpec extends AnyFunSuite {

  val tailRecursion = new TailRecursion()
  val list = List(1,3,5,7,8,89,8,0,8,8,9,9,9,9)
  val set = Set(1,2, 3,4,5,6,7,8)

  test("Length of a list" ) {
    assert(tailRecursion.getLength(list) == 14)
  }

  test("Length of a empty list be zero" ) {
    assert(tailRecursion.getLength(List()) == 0)
  }

  test("Length of a set" ) {
    assert(tailRecursion.getLengthSet(set) == 8)
  }

  test("Length of a  empty set be 0" ) {
    assert(tailRecursion.getLengthSet(Set()) == 0)
  }

}
