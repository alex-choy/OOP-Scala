package value

class Number(val Value: Double) extends expression.Literal {
  def +(other: Number) = Number(this.Value + other.Value)
  def *(other: Number) = Number(this.Value * other.Value)
  def -(other: Number) = Number(this.Value - other.Value)
  def /(other: Number) = Number(this.Value / other.Value)
  def <(other: Number) = Boole(this.Value < other.Value)
  def ==(other: Number) = Boole(this.Value == other.Value)
  override def toString = Value.toString
}

object Number {
  def apply(value: Double) = new Number(value)
}

