// Funciones operaciones  Crear 20 funciones con la siguiente base de datos CitiGroup2006_2008

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/guadalupe/Escritorio/BigData/Unidad1/Spark_DataFrame/BigData/Spark_DataFrame/CitiGroup2006_2008")

df.printSchema()

import spark.implicits._

df.select(countDistinct($"Open")).show() 

df.select(sumDistinct($"Open")).show() 

df.select(collect_set($"Open")).show() 

df.select(collect_list($"Open")).show() 

df.select(max($"High")).show() 

df.select(log($"High")).show() 

df.select(min("Open")).show() 

df.select($"Open".as("OPEN")).show() 

df.select(sum($"Low")).show() 

df.select(variance($"Open")).show() 

df.select(var_pop($"Open")).show() 

df.select(var_samp($"Open")).show() 

df.select(length($"Open")).show() 

df.select(skewness($"Open")).show() 
