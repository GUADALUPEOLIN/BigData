

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/guadalupe/Escritorio/BigData/Unidad1/Spark_DataFrame/BigData/Spark_DataFrame/Sales.csv")

df.printSchema()

df.show()




val companias=df.groupBy($"Company").agg(collect_set($"Person").as ("personas")).show() 

df.select(avg("Sales")).show() 


df.groupBy(df.col("Person")).agg(avg("Sales")).show()


df.groupBy($"Company").agg(max($"Sales")).show() 


df.filter(col("Sales")<=600).groupBy().count().show 


df.groupBy($"Sales").agg(count("*")).show() 


