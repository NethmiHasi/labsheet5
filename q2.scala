package labsheet5

import scala.io.StdIn

object q2 {
  def main(args: Array[String]): Unit = {
    println("Enter the number ")
    val num = StdIn.readInt()
    print("prime numbers up to "+num +" : ")
    primeSeq(num - 1)
  }

  def prime(num: Int, i: Int = 2): Boolean = num match {
    case 1 => false
    case num if (num == i) => true
    case num if (num % i == 0) => false
    case _ => prime(num, i + 1)
  }

  def primeSeq(num: Int): Unit = {
    if (num == 2) {
      print(num)
    }
    else {
      primeSeq(num - 1)
      if (prime(num))
        print("," + num)
    }

  }
}
