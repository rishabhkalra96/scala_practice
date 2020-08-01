class Rational (n: Int, d: Int) {
 require(d != 0)

 val numerator: Int = n
 val denominator: Int = d

 def this(n: Int) = this(n,1) // auxiliary constructor, like overloaded constructor
 override def toString = s"${n}/${d}"

 def add (that: Rational): Rational = new Rational((this.numerator*that.denominator + that.numerator * this.denominator), this.denominator*that.denominator)

 def lessThan (that: Rational) = numerator * that.denominator < that.numerator * denominator

 def max (that: Rational) = if (lessThan(that)) that else this
}

val value1 = new Rational(3,1)
val value2 = new Rational(4,1)
val sum = (value1).add(value2)
println(s"sum of ${value1} and ${value2} is ${sum}")
println(s"is ${value1} < ${value2} = ${value1 lessThan value2}")
println(s"max of ${value1} and ${value2} is ${value1 max value2}")
println(s"value after invoking with one parameter is ${new Rational(3)}")

