
class Robot {
  private var name = "Rishabh"
  private var Rtype = "Industrial"
  private var accuracy = 98

  def introduceSelf() {
    println("Hi, My name is "+ 
      this.name +
      "\nI belong to type "+
      this.Rtype + 
      "\n and i have an accuracy of " +
      this.accuracy +
      "%\n")
  }
}

val r1 = new Robot()
r1.introduceSelf()
