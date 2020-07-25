def isUnique(x: String): String = {
  val boolRecorder = new Array[Boolean](256)
  x.foreach(character => {
    // println("value converted " + character + " to " + character.toInt)
    if (boolRecorder(character.toInt)) return "Not Unique"
    else boolRecorder(character.toInt) = true
  })
  return "unique"
}

def isUniqueEfficient(x: String): String = {
  var checker: Int = 0
  x.foreach(char => {
    val value: Int = char - 'a'
    if ((checker & (1 << value)) > 0) return "not unique"
    else checker |= 1<<value
  })
  return "unique"
}

val answer = isUnique(args(0))
println("using efficient approach --> " + isUniqueEfficient(args(0)))
println(answer)
