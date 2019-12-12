[En la uniada 2 se vieron temas de basic statistec]

El teorema de Bayes es utilizado para calcular la probabilidad de un suceso, teniendo información de antemano sobre ese suceso.

Podemos calcular la probabilidad de un suceso A, sabiendo además que ese A cumple cierta característica que condiciona su probabilidad.  El teorema de Bayes entiende la probabilidad de forma inversa al teorema de la probabilidad total. El teorema de la probabilidad total hace inferencia sobre un suceso B, a partir de los resultados de los sucesos A. Por su parte, Bayes calcula la probabilidad de A condicionado a B.

El teorema de Bayes ha sido muy cuestionado. Lo cual se ha debido, principalmente, a su mala aplicación. Ya que, mientras se cumplan los supuestos de sucesos disjuntos y exhaustivos, el teorema es totalmente válido.
Regla de Bayes
Thomas Bayes, reverendo presbiteriano inglés (1702-1761).


Vemos  antes que P(A∣B)
no coincide con P(B∣A). La regla de Bayes, también llamada regla de la probabilidad inversa establece la relación entre estas probabilidades. P(B∣A)=P(A∣B)⋅P(B)P(A) La probabilidad P(B) se conoce como probabilidad a priori (ex ante) y la probabilidad P(B/A) se llama probabilidad a posteriori (ex post). En una relación causa-efecto, se trata de determinar la probabilidad de la causa, cuando se ha producido un determinado efecto.

[onevsrest]

uno contra uno

En la reducción uno contra uno (OvO), uno entrena a los clasificadores binarios K ( K - 1) / 2 para un problema multiclase K -way; cada uno recibe las muestras de un par de clases del conjunto de entrenamiento original y debe aprender a distinguir estas dos clases. En el momento de la predicción, se aplica un esquema de votación: todos los clasificadores K ( K - 1) / 2 se aplican a una muestra invisible y el clasificador combinado predice la clase que obtuvo el mayor número de predicciones "+1". [3] : 339

Al igual que OvR, OvO sufre de ambigüedades en que algunas regiones de su espacio de entrada pueden recibir el mismo número de votos.

import org.apache.spark.sql.SparkSession

import org.apache.spark.ml.feature.VectorAssembler

import org.apache.spark.ml.feature.StringIndexer

import org.apache.spark.ml.linalg.Vectors

import org.apache.spark.ml.Pipeline

import org.apache.spark.sql.types._

import org.apache.spark.ml.classification.MultilayerPerceptronClassifier

import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

//inicializacion de spark

val Spark= SparkSession.builder()getOrCreate()

val dataset = spark.read.option("header","true").option("inferSchema", "true")csv("/home/guadalupe/Escritorio/BigData/iris-master/iris.csv")
dataset.show()


//structtype es un tipo de datos incorporado que es una colección de StructFields.

 extrae las columnas que se le declaren en los strucfield (transforma tipo de datos)
val structtype1 = 

StructType (
StructField("sepal_length",DoubleType,true)::
StructField("sepal_width",DoubleType,true)::
StructField("petal_length",DoubleType,true)::
StructField("petal_width",DoubleType,true)::
StructField("species",StringType,true):: Nil)

//funcion para limpiar datos e importacion
val dfstruct = spark.read.option("header","false").schema(structtype1)csv("/home/guadalupe/Escritorio/BigData/iris-master/Iris.csv")

dfstruct.show()
//obtener etiquetas de columna de tipo de flor
val label = new StringIndexer().setInputCol("species").setOutputCol("label")

//obtenie las caracteristicas y las asigna a una etiqueta
val assembler = new VectorAssembler().setInputCols(Array("sepal_length","sepal_width","petal_length","petal_width")).setOutputCol("features")

//declaracion de entrenamiento y prueba  6 de entrenamiento y 4 de prueba con 4 semillas
val splits = dfstruct.randomSplit(Array(0.6,0.4),seed=1234L)
val train = splits(0)
val test = splits(1)


//declaracion de neuronas entradas, ocultas y salidas
val layers = Array Int (4,5,4,3)

val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setLabelCol

("label").setFeaturesCol("features").setPredictionCol("prediction").setBlockSize
(128).setSeed(1234L).setMaxIter(100)

val pipeline = new Pipeline().setStages(Array(label,assembler,trainer))
val model = pipeline.fit(train)

val result = model.transform(test)

//Mostramos el resultado

val predictions = model.transform(test)
//predictions.show(5)

result.show()

//Selecciona los features y la prueba de error (Multiclass es la funcion que realiza clasificacion)

val predictionAndLabels=result.select("prediction","label")

val evaluator=new MulticlassClassificationEvaluator().setMetricName("accuracy")

//Imprimimos los resultados de exactitud utilizando un evaluador multiclase (accuracy es predicción)

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
