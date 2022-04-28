package org.example

import org.apache.spark.sql.SparkSession

/**
 * Hello world!
 *
 */
object MyFirstProjects extends App {
  System.setProperty("hadoop.home.dir", "C:/Hadoop/")
  println( "Hello World!" )

  val spark = SparkSession.builder.appName( name = "ma_session_spark").getOrCreate()
  val df =  spark.read.csv(path="README.txt")
  df.show()

}
