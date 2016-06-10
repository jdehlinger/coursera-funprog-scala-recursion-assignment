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

balance("(t(s))".toList)



