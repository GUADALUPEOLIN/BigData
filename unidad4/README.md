





TECNOLÓGICO NACIONAL DE MÉXICO.

INSTITUTO TECNOLÓGICO DE TIJUANA
 
SUBDIRECCIÓN ACADÉMICA
DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN
SEMESTRE AGOSTO – DICIEMBRE 2019
 
ING. Informatica

Materia: Datos masivos
 
Proyecto
Unidad 4

Alumna
Guadalupe Olin Malaga
 
Profesor
José Christian Romero
 
Tijuana, B.C; a 6 de diciembre  de 2019







ÍNDICE 

INTRODUCCIÓN……………………………………………………….……...3

OBJETIVO…………………………………………………………………..…..3

MARCO TEÓRICO DE LOS ALGORITMOS………………….………..… 4

LOGISTIC REGRESSION…………………………………………...…….....6


MULTILAYER PERCEPTRON………………………………….…………..8

ÁRBOL DE DECISIONES……………………………………………..….....10


IMPLEMENTACIÓN …………………………………………………….….11

RESULTADOS…………………………………………………………...…... 16

CONCLUSIONES……………………………………………………...……..17 

REFERENCIAS………………………………………………………..…….18




Introducción.
En el transcurso del siguiente documento se hará presente la codificación de 4 métodos de clasificación con algoritmos de machine learning donde se podrá analizar el desempeño y resultado que cada uno nos proporciona para poder determinar un modelo especifico que nos permita evaluar de manera correcta un dataset de una gran cantidad de datos, mismo que debemos manipular y depurar para llegar a la finalidad que es analizarlo desde la naturaleza de los datos que lo constituyen hasta obtener la optimización de la precisión del dataset.  
Objetivo.
Se llevará a cabo la comparación del rendimiento de los siguientes algoritmos de machine learning.

SVM.
Árboles de decisión.
Logistic Regression.
Multilayer Perceptron.
 
Con el siguiente data set: https://archive.ics.uci.edu/ml/datasets/Bank+Marketing
Para observar que tan óptimos son con una cantidad de datos superior a los 40’000 y con 17 columnas al finalizar se optara por un solo algoritmo de machine learning y se justificará la selección.


LOGISTIC REGRESSION
La regresión logística es un tipo de análisis de regresión utilizado para predecir el resultado de una variable categórica (una variable que puede adoptar un número limitado de categorías) en función de las variables independientes o predictoras.
La regresión logística es un algoritmo de clasificación utilizado para asignar observaciones a un conjunto discreto de clases. A diferencia de la regresión lineal que genera valores numéricos continuos, la regresión logística transforma su salida utilizando la función sigmoide logística para devolver un valor de probabilidad que luego puede asignarse a dos o más clases discretas.
La regresión logística es otra técnica prestada por el aprendizaje automático del campo de la estadística. 
Es el método de referencia para problemas de clasificación binaria (problemas con dos valores de clase). En esta publicación descubrirá el algoritmo de regresión logística para el aprendizaje automático. 
Función logística 
La regresión logística se nombra para la función utilizada en el núcleo del método, la función logística. 
La función logística , también llamada función sigmoidea, fue desarrollada por estadísticos para describir las propiedades del crecimiento de la población en ecología, aumentando rápidamente y maximizando la capacidad de carga del medio ambiente. Es una curva en forma de S que puede tomar cualquiernúmero de valor real y asignarlo a un valor entre 0 y 1, pero nunca exactamente en esos límites.                      4

1 / (1 + e ^ -valor) 
Donde e es la base de los logaritmos naturales (el número de Euler o la función EXP () en su hoja de cálculo) y el valor es el valor numérico real que desea transformar. A continuación se muestra una gráfica de los números entre -5 y 5 transformados en el rango 0 y 1 usando la función logística.



SUPPORT VECTOR MACHINE


El método de clasificación-regresión Máquinas de Vector Soporte (Vector Support Machines, SVMs) fue desarrollado en la década de los 90, dentro de campo de la ciencia computacional. Si bien originariamente se desarrolló como un método de clasificación binaria, su aplicación se ha extendido a problemas de clasificación múltiple y regresión. SVMs ha resultado ser uno de los mejores clasificadores para un amplio abanico de situaciones, por lo que se considera uno de los referentes dentro del ámbito de aprendizaje estadístico y machine learning.
Las Máquinas de Vector Soporte se fundamentan en el Maximal Margin Classifier, que a su vez, se basa en el concepto de hiperplano. A lo largo de este ensayo se introducen por orden cada uno de estos conceptos. Comprender los fundamentos de las SVMs requiere de conocimientos sólidos en álgebra lineal. En este ensayo no se profundiza en el aspecto matemático, pero puede encontrarse una descripción detallada en el libro Support Vector Machines Succinctly by Alexandre Kowalczyk
En R, las librerías e1071 y LiblineaR contienen los algoritmos necesarios para obtener modelos de clasificación simple, múltiple y regresión, basados en Support Vector Machines.         

      6
Las máquinas de vectores de soporte se basan en el concepto de planos de decisión que definen los límites de decisión. Un plano de decisión es aquel que se separa entre un conjunto de objetos que tienen diferentes miembros de clase. Un ejemplo esquemático se muestra en la siguiente ilustración. En este ejemplo, los objetos pertenecen a la clase VERDE o ROJO. La línea de separación define un límite en el lado derecho del cual todos los objetos son VERDES y a la izquierda de los cuales todos los objetos son ROJOS. Cualquier objeto nuevo (círculo blanco) que caiga a la derecha se etiqueta, es decir, se clasifica como VERDE (o se clasifica como ROJO si cae a la izquierda de la línea de separación)


MULTILAYER PERCEPTRON

Un MLP es una red de neuronas simples llamados perceptrones. El concepto básico de un único perceptrón fue introducido por Rosenblatt en 1958. El perceptrón calcula una sola salida de múltiples entradas de valor real mediante la formación de una combinación lineal de acuerdo con sus pesos de entrada y, a continuación, posiblemente, poner la salida a través de alguna función de activación lineal.

Definición.
El perceptrón multicapa es una red neuronal artificial (RNA) formada por múltiples capas, esto le permite resolver problemas que no son linealmente separables, lo cual es la principal limitación del perceptron (también llamado perceptrón simple). El perceptrón multicapa puede ser totalmente o localmente conectado. 

Algoritmos.
Este modelo,consta de varias capas de unidades computacionales interconectadas entre sí; cada neurona en una capa se encuentra directamente conectada a las neuronas de la capa anterior. El modelo se encuentra basado en funciones ya que cada unidad de las redes mencionadas aplica una función de activación.


Funcionalidad.
Uno de los objetivos propuestos por el Centro de Meteorología Marina (CMM), es la realización diaria de un pronóstico meteorológico marino el cual cubre las aguas territoriales del país y mares adyacentes. El personal de este centro utilizará estas observaciones íntegramente para facilitar un servicio meteorológico adecuado a todas las formas de actividades marinas

Se empleó el modelo Perceptrón Multicapa (MLP) como una RNA clasificadora para realizar el pronóstico de inundaciones costeras por penetraciones del mar en la costa norte de la región occidental de Cuba, determinando la clasificación de las situaciones meteorológicas de pronóstico actual.

Redes Neuronales Artificiales (RNA) como modelos entrenados para realizar conexiones entre los valores pasados y presentes, aprendiendo de su error de pronóstico, y extraer estructuras y relaciones escondidas que gobiernan el sistema de información (Jalil, 2006), a su vez que se almacena esta clasificación. Estas redes han tenido una mayor atención en las recientes investigaciones para la realización de los pronósticos marinos.

ÁRBOL DE DECISIONES

Árboles de Decisión. Técnica que permite analizar decisiones secuenciales basada en el uso de resultados y probabilidades asociadas. Los árboles de decisión se pueden usar para generar sistemas expertos, búsquedas binarias y árboles de juegos, los cuales serán explicados posteriormente. 

Las ventajas de un árbol de decisión son: 
• Resume los ejemplos de partida, permitiendo la clasificación de nuevos casos siempre y cuando no existan modificaciones sustanciales en las condiciones bajo las cuales se generaron los ejemplos que sirvieron para su construcción. 
• Facilita la interpretación de la decisión adoptada. 
• Proporciona un alto grado de comprensión del conocimiento utilizado en la toma de decisiones. 
• Explica el comportamiento respecto a una determinada tarea de decisión. 
• Reduce el número de variables independientes. 
• Es una magnifica herramienta para el control de la gestión empresarial. Los árboles de decisión se utilizan en cualquier proceso que implique toma de decisiones, ejemplos de estos procesos son: -Búsqueda binaria. -Sistemas expertos. 
-Árboles de juego 

Los árboles de decisión generalmente son binarios, es decir que cuentan con dos opciones, aunque esto no significa que no puedan existir árboles de tres o mas opciones.
10
Los modelos de árbol, donde la variable de destino puede tomar un conjunto finito de valores se denominan árboles de clasificación. En estas estructuras de árbol, las hojas representan etiquetas de clase y las ramas representan las conjunciones de características que conducen a esas etiquetas de clase. Los árboles de decisión, donde la variable de destino puede tomar valores continuos (por lo general números reales) se llaman árboles de regresión.

En análisis de decisión, un árbol de decisión se puede utilizar para representar visualmente y de forma explícita decisiones y toma de decisiones. En minería de datos, un árbol de decisión describe datos, pero no las decisiones; más bien el árbol de clasificación resultante puede ser un usado como entrada para la toma de decisiones. Esta página se ocupa de los árboles de decisión en la minería de datos.

IMPLEMENTACION
// Logistic Regresion 

//Importacion de librerias a utilizar para la corrida del codigo llamando funciones
//y la libreria de la regresion logistica..
import org.apache.spark.sql.expressions._
import org.apache.spark.sql.functions._
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.Pipeline

//Se declara la variable log_Re para utilizar la regresion logistica en la columna "Y"
//con un maximo de 10 iteraciones.
val log_Re = new LogisticRegression().setLabelCol("y").setMaxIter(10)

//Si le damos un parametro para el setMaxIter y el setRegParam no nos arroja una matriz de confusion correcta
//val lr = new LogisticRegression().setMaxIter(10).setRegParam(0.3).setElasticNetParam(0.8)

//utilizamos el pipeline(embudo) para tomar en un arreglo los indexer creados
val pipelinelog_Re = new Pipeline().setStages(Array(jobIndexer,maritalIndexer, eduIndexer, defaultIndexer, housingIndexer, loanIndexer, contactIndexer, monthIndexer, Encoder, assembler,log_Re))

//se realiza el modelo de entrenamiento y se transforman los datos para arrojarlos como resultados de pruebas
val modellog_Re = pipelinelog_Re.fit(training)
val resultslog_Re = modellog_Re.transform(test)
//Variable de prediccion y mediciones.  

val predictionAndLabelslog_Re = resultslog_Re.select($"prediction",$"y").as[(Double, Double)].rdd

import org.apache.spark.mllib.evaluation.MulticlassMetrics
val metricsLog_Re = new MulticlassMetrics(predictionAndLabelslog_Re)

//Matriz de confusion donde nos indicara cuales fueron los falsos positivos y falsos negativos.
println("Matriz de confusion: ")
println(metricsLog_Re.confusionMatrix)

//Resultado de la Exactitud
println("Exactitud")
println(metricsLog_Re.accuracy)

RESULTADO


//SVM 

import org.apache.spark.ml.classification.LinearSVC

//Debido a que ya hemos precargado el dataset con el que se va a trabajar
//Se evita la redundancia de informacion y la siguiente linea de codigo
//val training = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt")
val l_SVM = new LinearSVC().setLabelCol("y").setMaxIter(10)

val pipelinel_SVM = new Pipeline().setStages(Array(jobIndexer,maritalIndexer, eduIndexer, defaultIndexer, housingIndexer, loanIndexer, contactIndexer, monthIndexer, Encoder, assembler, l_SVM))

val modell_SVM = pipelinel_SVM.fit(training)
val resultsl_SVM = modell_SVM.transform(test)

val predictionAndLabelsl_SVM = resultsl_SVM.select($"prediction",$"y").as[(Double, Double)].rdd

val metricsl_SVM = new MulticlassMetrics(predictionAndLabelsl_SVM)

//println("Confusion matrix:")
println("Matriz de confusion: ")
println(metricsl_SVM.confusionMatrix)
println("Exactitud: ")
println(metricsl_SVM.accuracy)



//Arbol de Desiciones 

import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}

val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(df)
// Automatically identify categorical features, and index them.
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4)// features with > 4 distinct values are treated as continuous. .fit(data)
// Split the data into training and test sets (30% held out for testing).
val Array(trainingData, testData) = df.randomSplit(Array(0.6, 0.4))
// Train a DecisionTree model.
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
// Convert indexed labels back to original labels.
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
// Chain indexers and tree in a Pipeline.
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
// Train model. This also runs the indexers.
val model = pipeline.fit(trainingData)
// Make predictions.
val predictions = model.transform(testData)
// Select example rows to display.
predictions.select("predictedLabel", "label", "features").show(5)
// Select (prediction, true label) and compute test error.
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")

val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")


RESULTADOS
11844.0
316.0

1153.0
441.0
0.8931947
12160.0
0.0

1594.0
0.0
0.8841064



Conclusión.
El mejor hasta el momento es Regresión logística (Hubo problemas con la normalización de los datos en 
el arboles de decisión) y por la exactitud que ha manejado con los datos, en las siguientes imágenes 
donde se observa el resultado de cada una y la precisión que nos ofrece la regresión logística.
Posiblemente esto se origine gracias a la matriz de confusión donde se detalla realmente que tantos 
falsos negativos o positivos se tienen. Para este data set de más de 40 000 datos se concluye que
el algoritmo de clasificación de mejor empleabilidad seria Regresión logística.

REFERENCIAS 


1. Cornfield J, Gordon T, Smith WN. Quantal response curves for experimentally uncontroled variables. Bull Int Statist Inst 1961;38:97-115. 

2. J Hernández Árbol De Decisión
http://www.utm.mx/~jahdezp/archivos%20estructuras/DESICION.pdf

3. Walter S, Duncan D. Estimation of the probability of an event as a function of several variables. Biometrika 1967;54:167-79. http://scielo.sld.cu/scielo.php?script=sci_arttext&pid=S1561-29532001000100007















18
