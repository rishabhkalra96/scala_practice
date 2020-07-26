import Robot.callme

object MainTrigger {
  def main(args: Array[String]) {
    var counter = 0
    for (arg <- args) {
    if(callme(arg))
      counter += 1
    }
    println("Total counts are " + counter)
  }
}
