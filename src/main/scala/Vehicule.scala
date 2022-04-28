case class Vehicule(
                     MATRICULE_ID : String,
                     COULEUR : String,
                     TRANSMISSIONS_TYPE : String,
                     MOTEUR_TYPE : String

                   ) {


  def acceler() : Unit = {
    println("VRUM")
  }

  def freiner() : Unit = {
    println("IIIIIIHHHHHHHHHs")

  }
  def vitesseMax(type_moteur : String, transmission : String) : Int =  {
    if ( type_moteur == "4 CYLINDER" && transmission == "AUTOMATIC"){
      150
    } else {
      100
    }
  }


}
