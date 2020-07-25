def isUnique(x: String): String = {
  val boolRecorder = new Array[Boolean](256)
  x.foreach(character => {
    // println("value converted " + character + " to " + character.toInt)
    if (boolRecorder(character.toInt)) return "Not Unique"
    else boolRecorder(character.toInt) = true
  })
  return "unique"
}

val answer = isUnique(args(0))
println(answer)
