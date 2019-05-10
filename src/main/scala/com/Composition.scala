package com

class Composition {

  class Customer(val name: String, val id:String)
  class User(val name: String)

  def makeCustomer : User => Customer={
    user => new Customer(user.name,"Rand")
  }
def printCustomer(costumer: Customer)={
  print( s" this is ${costumer.name} aka ${costumer.id}")
}
  val guy = new User("Jim");
  {
    makeCustomer(guy)
    printCustomer(makeCustomer(guy))
  }
}
