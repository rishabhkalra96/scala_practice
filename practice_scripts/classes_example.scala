class Rational (n: Int, d: Int) {
 require(d != 0)

 private val g = gcd(n.abs, d.abs) // to reduce the fraction into ints simplest form by default, example Rational(12,4) means 3/1

 val numerator: Int = n / g
 val denominator: Int = d / g

 private def gcd(a: Int, b: Int): Int = 
   if (b == 0) a else gcd(b, a % b)

 def this(n: Int) = this(n,1) // auxiliary constructor, like overloaded constructor
 override def toString = s"${numerator}/${denominator}"

 def + (that: Rational): Rational = new Rational((this.numerator*that.denominator + that.numerator * this.denominator), this.denominator*that.denominator)

 def + (i: Int): Rational = new Rational (numerator + i * denominator, denominator)

 def - (that: Rational): Rational = new Rational (numerator * that.denominator - that.numerator * denominator, denominator * that.denominator)

 def - (i: Int): Rational = new Rational (numerator - i * denominator, denominator)

 def * (that: Rational): Rational = new Rational(numerator * that.numerator, denominator * that.denominator)

 def * (i: Int): Rational = new Rational (numerator * i, denominator)

 def / (that: Rational): Rational = new Rational (numerator * that.denominator, denominator * that.numerator)

 def / (i: Int): Rational = new Rational (numerator, denominator*i)

 def lessThan (that: Rational) = numerator * that.denominator < that.numerator * denominator

 def max (that: Rational) = if (lessThan(that)) that else this
}

implicit def intToRational(x: Int) = new Rational(x)

val value1 = new Rational(3,1)
val value2 = new Rational(4,1)
val sum = (value1) + (value2)
println(s"sum of ${value1} and ${value2} is ${sum}")
println(s"is ${value1} < ${value2} = ${value1 lessThan value2}")
println(s"max of ${value1} and ${value2} is ${value1 max value2}")
println(s"value after invoking with one parameter is ${new Rational(3)}")
println(s"simplest form of 66/42 is ${new Rational(66, 42)}")
println(s"product of two values ${value1} and ${value2}is ${value1 * value2}")
println(s"sum of 2 and ${value2} is ${value2 + 2}")
println(s"product of 2 and ${value2} is ${value2 * 2}")
println(s"sub of ${value2} and 2 is ${value2 - 2}")
println(s"opposite of above statement sum will also work -> ${2} + ${value2} = ${2 + value2}")
