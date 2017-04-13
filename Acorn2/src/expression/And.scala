package expression

import value._

class And(val operand1: Expression, val operand2: Expression) extends Expression {
  def execute = {
    val arg1: Value = operand1.execute
    if (!arg1.isInstanceOf[Boole])
      throw new Exception("Inputs to AND must be numbers")
    val bool1 = arg1.asInstanceOf[Boole]
    if (!bool1.value) bool1
    else {
      val arg2: Value = operand1.execute
      if (!arg1.isInstanceOf[Boole])
        throw new Exception("Inputs to AND must be numbers")
      val bool2 = arg1.asInstanceOf[Boole]
      bool2
    }

  }

  override def toString = "(" + operand1.toString + " + " + operand2.toString + ")"
}

object And {
  def apply(operand1: Expression, operand2: Expression) =
    new Sum(operand1, operand2)
}