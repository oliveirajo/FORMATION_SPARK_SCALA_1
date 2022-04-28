object ProgramationScala{


  // variable de portée publique
  val session_kafka : Int = 15 // variable immutable
  var session_kafka_mu :Int = 15 // variable mutable
  val ss = "mon text - Je suis sur une formation en français!"
  val renault_megane : Vehicule =  new Vehicule("012231D","BLANC","AUTOMATIC","4 CYLINDER")


  def main (args : Array[String]) : Unit = {
    println("Hello World, Scala")
    var coleur : String =  renault_megane.COULEUR
    renault_megane.acceler()
    renault_megane.vitesseMax(type_moteur = "",transmission = "")

    fonction2()
    println("la coleur  du véhicule renault megane est: " + renault_megane.COULEUR)
    println("la coleur  du véhicule renault megane est: " + coleur)

    tesHello("Voici mon texte")
    val valeur = testHellof(150,10)
    println(valeur)

    structuresConditionnelles()
  }

  def fonction2() : Unit = {
    session_kafka_mu = 10
    println("valeur de la variable :" + session_kafka_mu + "\n" + ss)
  }

  //définition d'une méthode
  def tesHello (texte :  String) : Unit = {
    val a = 10
    val b = 150
    val c =  a + b
    println("voici votre message: " + texte)
    return c
  }

  def testHellof (a : Int, b : Int) : Int = {
    val c = a + b
    return c
  }

  def structuresConditionnelles() : Unit = {
    var i = 0
    while(i < 7) {
      println(i)
      i =  i + 1
    }

    var j = 0

    for(j <- 0 to  10) { // no need to increment. We are saying to execute the
      println(j)
      //j = j + 1
    }

    if (i > j) {
      println("i est súperior à j")
    } else {
      println("i est inférieur à j")
    }
  }
}