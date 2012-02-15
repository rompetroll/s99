package s99

import org.specs2.matcher.ThrownExpectations

trait ListsSolutions {
  import Solutions._

  def last[T](list: List[T]): T = list.reverse.head
  def penultimate[T](list: List[T]): T = list.reverse.tail.head
  def nth[T](n: Int, list: List[T]): T = list(n)
  def length[T](list: List[T]): Int = list.size 
  def reverse[T](list: List[T]): List[T] = list.reverse
  def isPalindrome[T](list: List[T]): Boolean = list.zipWithIndex.map(tuple => tuple._1 == list(list.size - (1+tuple._2))).forall(_ == true)
  def flatten[T](list: List[Any]): List[T] = list.flatMap({case a:List[_] => flatten(a); case b:T => List(b)})
  def compress[T](list: List[T]): List[T] = list.foldRight(List[T]())((elem,l) => { if (l.isEmpty || (elem != l.head)) elem :: l else l }) 
  def pack[T](list: List[T]): T = ???
  def encode[T](list: List[T]): List[(Int, T)] = ???
  def encodeModified[T](list: List[T]): List[(Int, T)] = ???
  def decode[T](list: List[(Int, T)]): List[T] = ???
  def encodeDirect[T](list: List[T]): List[(Int, T)] = ???
  def duplicate[T](list: List[T]): List[T] = ???
  def duplicateN[T](n: Int, list: List[T]): List[T] = ???
  def drop[T](n: Int, list: List[T]): List[T] = ???
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = ???
  def slice[T](i: Int, j: Int, list: List[T]): List[T] = ???
  def rotate[T](n: Int, list: List[T]): List[T] = ???
  def removeAt[T](i: Int, list: List[T]): List[T] = ???
  def insertAt[T](t: T, i: Int, list: List[T]): List[T] = ???
  def range[T](i: Int, j: Int): List[Int] = ???
  def randomSelect[T](n: Int, list: List[T]): List[T] = ???
  def lotto[T](i: Int, j: Int): List[Int] = ???
  def randomPermute[T](list: List[T]): List[T] = ???
  def combinations[T](n: Int, list: List[T]): List[List[T]] = ???
  def group3[T](list: List[T]): List[List[List[T]]] = ???
  def group[T](ns: List[Int], list: List[T]): List[List[List[T]]] = ???
  def lsort[T](list: List[List[T]]): List[List[T]] = ???
  def lsortFreq[T](list: List[List[T]]): List[List[T]] = ???

}

object Solutions extends ThrownExpectations {
  lazy val ??? = skipped("todo")
}
