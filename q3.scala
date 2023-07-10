package labsheet5
import scala.io.StdIn

object q3 {

  //this function is only for positive integers
  def sum(num :Int) : Int = num match {
    case 0 => 0
    case _ => num + sum(num-1)

  }

  def main(args: Array[String]): Unit = {
    println("Enter the number ")
    val num = StdIn.readInt()
    print("The sum of numbers from 1 up to " + num + " : " + sum(num))
  }


}
