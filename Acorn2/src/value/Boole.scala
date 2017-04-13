package value

import expression._

class Boole (val value: Boolean) extends Literal {
  
  def && (other: Boole) = Boole(this.value && other.value)
  override def toString = value.toString
}

object Boole {
  def apply(value: Boolean) = new Boole(value)
  val TRUE = Boole(true)
  val FALSE = Boole(false)
}