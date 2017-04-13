package expression

import value._

class Sum(val operand1: Expression, val operand2: Expression) extends Expression {
  def execute = {
    val arg1: Value = operand1.execute
    val arg2: Value = operand2.execute

    if (!arg1.isInstanceOf[Number] || !arg2.isInstanceOf[Number])
      throw new Exception("Inputs must be numerical")
    arg1.asInstanceOf[Number] + arg2.asInstanceOf[Number]

  }
  
  override def toString = "(" + operand1.toString + " + " + operand2.toString + ")"
}

object Sum {
  def apply(operand1: Expression, operand2: Expression) = 
    new Sum(operand1, operand2)
}