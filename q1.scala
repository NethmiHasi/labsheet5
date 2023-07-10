package labsheet5
import scala.io.StdIn

object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the number ")
    val num = StdIn.readInt()
    println(prime(num))
  }

  def prime(num: Int, i: Int =2) : Boolean = num match{
    case 1 => false
    case num if (num==i) => true
    case num if (num%i == 0) => false
    case _ => prime(num, i+1)
  }

}
