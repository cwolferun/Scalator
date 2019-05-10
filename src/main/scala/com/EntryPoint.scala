package com

import scala.collection.mutable.ArrayBuffer

class EntryPoint {
  class Employee(var name:String = "Johm",var middle:String, var last:String = "Doe" ){
    var bodyCount : ArrayBuffer[String] = ArrayBuffer()
    def this(name:String, last:String){
      this(name,"",last)
    }
    def kill(victim:Employee):Unit={
      bodyCount append victim.name
    }
  }

  var ron = new Employee("Ron","Swanson")

}
