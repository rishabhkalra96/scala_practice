import Robot.callme

object MainTrigger extends App{
    var counter = 0
    for (arg <- args) {
    if(callme(arg))
      counter += 1
    }
    println("Total counts are " + counter)
  }
