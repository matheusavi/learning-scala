package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 4560056454656456L
  val aFloat: Float = 2.5f
  val aDouble: Double = 3.124

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
