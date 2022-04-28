import scala.collection.mutable._ //if in gray it means that is not being used
import scala.collection.immutable._ // the ._ indicates that we are importing everything.

//the types most used

object ProgramationScala{


  // variable de portée publique
  val session_kafka : Int = 15 // variable immutable
  var session_kafka_mu :Int = 15 // variable mutable
  val ss = "mon text - Je suis sur une formation en français!"
  val renault_megane : Vehicule =  Vehicule("012231D","BLANC","AUTOMATIC","4 CYLINDER")


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

    structuresDataScala()
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

  def structuresDataScala() : Unit = {
    //lists
    val list1 : List[Int] = List(1, 8, 5, 6, 9, 59, 23, 15, 4)
    val list_names : List[String] = List("Joao", "Joel", "Jose", "Jorge", "Sara")
    val nums = List.range(0,15)

    for (name <- list_names) { // print each component of the list
      println(name)
      println("=======================")
    }

    val liste_maj : List[String] =  list_names.map(e => e.toUpperCase())

    liste_maj.foreach(e => println(e))
    println("=======================")

    val liste_v = list_names.map(l => l.startsWith("J"))
    liste_v.foreach(l => println(l))
    println("=======================")

    //créer une liste dont le résultat est le double de la liste1

    val list1_double :  List[Int] = list1.map(e => e*2)
    println(list1)
    list1_double.foreach(e => println(e))

    //créer une liste dont les valeurs sont supérieur à 5 a partir de la liste1
    val list1_sup_5 : List[Int] =  list1.filter(_>5)
    println(list1)
    list1_sup_5.foreach(e => println(e))


    //tuple
    val nom_tuple : (String, Int, Boolean) =  ("joel",27, true)
    val tuple2 = (45, "lion", "terre", false)
    val vehicule2 =  ("Moteur Diesel", "AUTOMATIC", Vehicule("012231D","BLANC","AUTOMATIC","4 CYLINDER"), testHellof(14,57) )
    println(tuple2._3.toUpperCase)


    // mAP OU table de hachage ou TABLE de clé valeur

    val villes : scala.collection.mutable.Map[String, String] = scala.collection.mutable.Map(
      "PS" -> "Paris",
      "LS" -> "Lyon",
      "MA" -> "Marseille"
    )

    villes.foreach(k => println("clé " + k._1 + " valeur " + k._2))

    //tableau
    val tab : Array[String] = Array("Joel", "Joao", "Jose", "Jorge", "Sara")
    tab(0) = "Jonhy"
    val k = 0
    for(k <- 0 to 4){
      println(tab(k))
    }
  }
}