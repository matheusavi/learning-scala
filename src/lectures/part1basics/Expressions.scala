package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO SOMETHING) are executed (Java for example) vs
  // Expressions (GIVE ME THE VALUE OF SOMETHING) are evaluated (Scala)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF in Scala it's an EXPRESSION (Not Instruction like in other languages)
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN (While, loops). Avoid using loops.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unity === void
  println(aWeirdValue)

  // Side effects in Scala are expressions effects retuning unity
  // Side effects: println(), whiles, reassigning
  // Side effects are remnant of imperative languages, they are like instructions, but in scala they still
  // expressions returning unity

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

   println(aCodeBlock)

  // Questions
  // 1. difference between "hello world" vs println("hello world")?
  // The first one is a value of type string (string literal) and the second one is a Unity expression with a side
  // effect of printing something to the console

  // 2. What is the value of this
  val someValue = {
    2 < 3
  }
  println(someValue)
  // true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
  // 42


}
