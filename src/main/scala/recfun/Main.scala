package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def fact(n: Int): Int =
        if (n == 0) 1
        else n * fact(n-1)
      if (c == 0 || c == r) 1
      else fact(r) / (fact(c) * fact(r-c))
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def process(cs: List[Char], parans: Int): Boolean = cs match {
      case Nil => if (parans == 0) true else false
      case ')' :: _ if (parans < 1) => false
      case ')' :: rest => process(rest, parans - 1)
      case '(' :: rest => process(rest, parans + 1)
      case _   :: rest => process(rest, parans)
    }
    process(chars, 0)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }