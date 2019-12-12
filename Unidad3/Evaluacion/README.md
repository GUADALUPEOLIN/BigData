UNIDAD 3
<html>
<head>
<title> K MEANS</title>
</head>
<body>

<h1>¿QUE ES K MEANS?</h2>

<p>K-means es un algoritmo de clasificación no supervisada (clusterización) que agrupa objetos en k grupos basándose en sus características. El agrupamiento se realiza minimizando la suma de distancias entre cada objeto y el centroide de su grupo o cluster. Se suele usar la distancia cuadrática.
</p>
<b>El algoritmo consta de tres pasos:</b>

<li> 1. Inicialización: una vez escogido el número de grupos, k, se establecen k centroides en el espacio de los datos, por ejemplo, escogiéndolos aleatoriamente.</li>
   <li>2.  Asignación objetos a los centroides: cada objeto de los datos es asignado a su centroide más cercano.</li>
  <li> 3.  Actualización centroides: se actualiza la posición del centroide de cada grupo tomando como nuevo centroide la posición del promedio de los objetos pertenecientes a dicho grupo.</li>

  <b>ALGORITMO DE AGRUPACION <b>
  <p> Los  métodos  de  agrupamiento  no  paramétricos  pueden  dividirse  en  tres  grupos  fundamentales: jerárquicos,  particionales y  basados en densidad. Los algoritmos jerárquicos son aquellos en los que se va particionando el conjunto de  datos  por  niveles,  de  modo  tal  que  en  cada  nivel  generalmente  ,  se  unen  o  se  dividen  dos  grupos  del  nivel  anterior,  según  si  es  un  algoritmo  aglomerativo  o  divisivo. Los  algoritmos  particionales  son  los  que  realizan  una  división  inicial  de  los  datos  en grupos y luego mueven los objetos de un grupo a otro según se optimice alguna función objetivo. <p>
<P> Se repiten los pasos 2 y 3 hasta que los centroides no se mueven, o se mueven por debajo de una distancia umbral en cada paso.<P>
<P> El algoritmo k-means resuelve un problema de optimización, siendo la función a optimizar (minimizar) la suma de las distancias cuadráticas de cada objeto al centroide de su cluster.<P>
<P> Los objetos se representan con vectores reales de d
dimensiones (x1,x2,…,xn) y el algoritmo k-means construye k grupos donde se minimiza la suma de distancias de los objetos, dentro de cada grupo S={S1,S2,…,Sk}
 a su centroide. El problema se puede formular de la siguiente forma: <P>
<P> donde S
es el conjunto de datos cuyos elementos son los objetos xj representados por vectores, donde cada uno de sus elementos representa una característica o atributo. Tendremos k grupos o clusters con su correspondiente centroide μi <P>
<P> // 1. Importar una simple sesión Spark.<P>
<P>import org.apache.spark.sql.SparkSession<P>
<P>//2. Utilice las lineas de código para minimizar errores<P>
<P>import org.apache.log4j._<P>
<P>Logger.getLogger("org").setLevel(Level.ERROR)<P>
<P>//3. Cree una instancia de la sesión Spark<P>
<P>val spark = SparkSession.builder().getOrCreate()<P>
<P>//4. Importar la librería de Kmeans para el algoritmo de agrupamiento.<P>
<P>import org.apache.spark.ml.clustering.KMeans<P>
<P>//5. Carga el dataset de Wholesale Customers Data<P>
<P>val dataset = spark.read.option("header","true").option("inferSchema","true").csv("/home/guadalupe/Descargas/BigData-master/Scala_Kmeans/Wholesalecustmoersdata.csv")<P>
<P>//6. Seleccione las siguientes columnas: Fres, Milk, Grocery, Frozen, Detergents_Paper, Delicassen y llamar a este conjunto feature_data<P>
<P>val feature_data = dataset.select($"Fresh", $"Milk", $"Grocery", $"Frozen", $"Detergents_Paper", $"Delicassen")<P>
<P>dataset.printSchema
//7. Importar Vector Assembler y Vector
import org.apache.spark.ml.feature.{VectorAssembler,StringIndexer,VectorIndexer,OneHotEncoder}
import org.apache.spark.ml.linalg.Vectors
//8. Crea un nuevo objeto Vector Assembler para las columnas de caracteristicas como un conjunto de entrada, recordando que no hay etiquetas
val assembler = new VectorAssembler().setInputCols(Array("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")).setOutputCol("features")
//9. Utilice el objeto assembler para transformar feature_data<P>
<P>val training_data = assembler.transform(feature_data).select("features")<P>
<P>//10.Crear un modelo Kmeans con K=3<P>
<P>val kmeans = new KMeans().setK(3).setSeed(1L)<P>
<P>val model = kmeans.fit(training_data)<P>
<P>//11.Evalúe los grupos utilizando<P>
<P>val WSSSE = model.computeCost(training_data)<P>
<P>println("Within Set Sum of Squared Errors = WSSSE")<P>
<P>//12. ¿Cuáles son los nombres de las columnas?<P>
<P>println("Cluster Centers: ")<P>
<P>model.clusterCenters.foreach(println)<P>
<P>println("Channel,Region,Fresh,Milk,Grocery,Frozen,Detergents_Paper,Delicassen")<P>

</ul>
</body>
</html>

<br 