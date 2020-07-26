
class Robot {
  private var name = ""

  def introduceSelf() {
    println("Hi, My name is "+ this.name + "\n")
  }

  def setName(name: String) {this.name = name}
}

// companion object, also called singleton object. Since this object and class have same name, they can access each others private members
object Robot {
  private var calledTimes = 0

  def callme(argument: String) = {
    val ob = new Robot
    ob.name = argument
    ob.introduceSelf()
    true
  }
}
