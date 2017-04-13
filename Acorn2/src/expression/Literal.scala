package expression

class Literal extends Expression with value.Value {
  def execute = this

}