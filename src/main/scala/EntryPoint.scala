import scala.collection.mutable.ArrayBuffer

object EntryPoint {

  class Employee(var name: String = "Johm", var middle: String, var last: String = "Doe") {
    var bodyCount: ArrayBuffer[String] = new ArrayBuffer
    val allVictims = Map("first" -> "billy", 4 -> "bloak")

    def this(name: String, last: String) {
      this(name, "", last)
    }

    def this() {
      this("no", "one")
    }

    def kill(victim: Employee): Unit = {
      bodyCount append victim.name
      //      allVictims get "first" orElse "none"
    }

    def getANum = {
      bodyCount length
    }
  }

  var ron = new Employee("Ron", "Swanson")

  def main(args: Array[String]): Unit = {
    val timesTwo = (one: Int) => one * 2

    List(1, 3, 4, 5).map(timesTwo).foreach(println)
    printf(s"hey hey hey")
  }


  class anotherEmp(val age: Int) extends Employee {}

  val topDawg = new anotherEmp(4)
  val quick: Int = topDawg.age
}
