package labsheet5

import labsheet5.q4.isEven

import scala.io.StdIn

object q5 {

  def isEven(num: Int): Boolean = num match {
    case num if (num == 0) => true
    case num if (num == 1) => false
    case _ => isEven(num - 2)
  }

  // this is only for positive integers.
  def evenSum(num: Int):Int = num match {
    case num if (num==0) => 0
    case num if isEven(num) => num + evenSum(num -2)
    case _ => evenSum(num-1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter any number ")
    val num = StdIn.readInt()
    print("The sum of the even numbers up to "+ num + "  :  " + evenSum(num-1))
  }


}
