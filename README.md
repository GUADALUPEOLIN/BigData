UNIDAD 1

  




UNIDAD 2







UNIDAD 3

¿QUE ES K MEANS?

K-means es un algoritmo de clasificación no supervisada (clusterización) que agrupa objetos en k grupos basándose en sus características. El agrupamiento se realiza minimizando la suma de distancias entre cada objeto y el centroide de su grupo o cluster. Se suele usar la distancia cuadrática.

El algoritmo consta de tres pasos:

   1. Inicialización: una vez escogido el número de grupos, k, se establecen k centroides en el espacio de los datos, por ejemplo, escogiéndolos aleatoriamente.
   2.  Asignación objetos a los centroides: cada objeto de los datos es asignado a su centroide más cercano.
   3.  Actualización centroides: se actualiza la posición del centroide de cada grupo tomando como nuevo centroide la posición del promedio de los objetos pertenecientes a dicho grupo.

ALGORITMO DE AGRUPACION 

Los  métodos  de  agrupamiento  no  paramétricos  pueden  dividirse  en  tres  grupos  fundamentales: jerárquicos,  particionales y  basados en densidad. Los algoritmos jerárquicos son aquellos en los que se va particionando el conjunto de  datos  por  niveles,  de  modo  tal  que  en  cada  nivel  generalmente  ,  se  unen  o  se  dividen  dos  grupos  del  nivel  anterior,  según  si  es  un  algoritmo  aglomerativo  o  divisivo. Los  algoritmos  particionales  son  los  que  realizan  una  división  inicial  de  los  datos  en grupos y luego mueven los objetos de un grupo a otro según se optimice alguna función objetivo. 

//1. Importar una simple sesión Spark. 
//Una SparkSession es el objeto principal o la base a partir de la cual cuelga toda la funcionalidad de Apache Spark.

import org.apache.spark.sql.SparkSession

//2. Utilice las lineas de código para minimizar errores 
//
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

//3. Cree una instancia de la sesión Spark 

val spark = SparkSession.builder().getOrCreate()

//4. Importar la librería de Kmeans para el algoritmo de agrupamiento. 

import org.apache.spark.ml.clustering.KMeans

//5. Carga el dataset de Wholesale Customers Data 
val dataset = spark.read.option("Double,True").option("inferSchema","True")format("csv").load("/home/guadalupe/Descargas/BigData-master/Scala_Kmeans/Wholesalecustmoersdata.csv")
data.show()
df.printSchema()
//6. Seleccione las siguientes columnas: Fres, Milk, Grocery, Frozen, Detergents_Paper, Delicassen y llamar a este conjunto feature_data 

val feature_data = data.select($"Fres", $"Milk", $"Grocery", $"Frozen", $"Detergents_Paper", 
$"Delicassen")
feature_data.show()
//7. Importar Vector Assembler y Vector 
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

//8. Crea un nuevo objeto Vector Assembler para las columnas de caracteristicas como un conjunto de entrada, recordando que no hay etiquetas 
val Assembler = new VectorAssembler().setInputcols(Array("Fres","Milk","Grocery","Frozen","Detergents_Paper","Delicassen")setInputcol("features")

//9. Utilice el objeto assembler para transformar feature_data 

val dataset=Assembler.transform(feature_data)

//10. Crear un modelo Kmeans con K=3 

val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(dataset)

println("Cluster Centers: ")
model.clusterCenters.foreach(println)

//11.Evalúe los grupos utilizando 
val WSSE = model.computeCost(dataset)
println("Within set sum of Squared Errors = WSSE")

//12. ¿Cuáles son los nombres de las columnas? 
"Fres","Milk","Grocery","Frozen","Detergents_Paper", 
"Delicassen"
