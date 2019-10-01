import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/guadalupe/Escritorio/BigData-master/Spark_DataFrame/CitiGroup2006_2008")

df.printSchema()

df.head(2)
//comparamos los dias y los años 

df.select(month(df("Date"))).show()
// separador que contenga los años y sacar la media 

df.select(year(df("Date"))).show()

//para que ponga todo el año el meses 
val df2 = df.withColumn("Year", year(df("Date")))

val dfavgs = df2.groupBy("Year").mean()

dfavgs.select($"Year", $"avg(Close)").show()

//minimo año 
//min significa la media (para hacer  agrupaciones y operaciones)

val dfmins = df2.groupBy("Year").min()

dfmins.select($"Year", $"min(Close)").show()