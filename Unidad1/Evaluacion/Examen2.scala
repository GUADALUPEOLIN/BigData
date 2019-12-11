//1. Comineze una simple sesion spark
import org.apache.spark.sql.SparkSession
val spar = SparkSession.builder().getOrCreate()

//2.cargue el archivo Netflix stock CSV, haga que Spark infiera los tipos de datos 
val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/guadalupe/Escritorio/BigData/Spark_DataFrame/Netflix_2011_2016.csv")


//3.cuales son los nombre de las columnas 
df.columns

//4.como es el esquema 
df.printSchema()


//5.imprime las primeras 5 columnas 
df.select("Date","Open","High","Low","Close","Volume","Adj Close").show(5)
df.show(5)


//6. usa describe ()para aprender sobre el DataFrame
df.describe().show()

//7. Crea una nuevo datafreme como una columna nueva llamada "HV Ratio"
val df2 = df.withColumn("HV Ratio",df("High")/df("Volume"))
df2.printSchema()
df2.show()

//8. Que dia tuvo el pico mas alto en la columna "price"
df.orderBy($"High".desc).show()


//9.Cual es el significado de la columna cerrar "clase"
println("Son los valores de cierre de las inversiones de Netflix durante los dias analizados")

//10. Cual es el maximo y minimo de la columna "Volumen"
df.select(min(df("Volume"))).show()
df.select(max(df("Volume"))).show()

//Con Sintaxis Scala/Spark $ conteste los siguiente:
//a. cuantos dias fue la columna "Close" inferior a 600
df.filter($"Close"<600).count()

//b. Qué porcentaje del tiempo fue la columna "High" mayor que 500
(df.filter($"High">500).count() * 1.0 / df.count()) * 100

//c. Cuál es la correlación de Pearson entre columna y la columna volumen
df.select(corr("High","Volume")).show()

//d. Cuál es el máximo de la columna "high" por año
val dfyear = df.withColumn("Year",year(df("Date")))
val maxyear = dfyear.select($"Year", $"High").groupBy("Year").max()
val res = maxyear.select($"Year", $"max(High)")
res.show()

//e. Cuál es el promedio de columna "close" para cada mes del calendario
val dfmonth = df.withColumn("Month",month(df("Date")))
val avgmonth = dfmonth.select($"Month",$"Close").groupBy("Month").mean()
avgmonth.select($"Month",$"avg(Close)").orderBy("Month").show()


