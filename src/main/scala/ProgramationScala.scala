object ProgramationScala{


  // variable de portée publique
  val session_kafka : Int = 15 // variable immutable
  var session_kafka_mu :Int = 15 // variable mutable
  val ss = "mon text - Je suis sur une formation en français!"

  def main (args : Array[String]) : Unit = {
    println("Hello World, Scala")
    fonction2()
  }

  def fonction2() : Unit = {
    session_kafka_mu = 10
    println("valeur de la variable :" + session_kafka_mu + "\n" + ss)
  }
}