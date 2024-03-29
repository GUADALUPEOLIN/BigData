Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"


import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer

var colores= new ListBuffer[String]()
colores: scala.collection.mutable.ListBuffer[String] = ListBuffer()

colores += "rojo"

colores += "blanco"

colores += "negro"


val listadecolores = colores.toList
listadecolores: List[String] = List(rojo, blanco, negro)




2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"



val listadecolores = colores.toList
listadecolores: List[String] = List(rojo, blanco, negro)

colores += "verde"
colores += "amarillo"
colores += "naranja"
colores += "azul"
colores += "perla"

val listadecolores = colores.toList
listadecolores: List[String] = List(rojo, blanco, negro, verde, amarillo, naranja, azul, perla)

listadecolores



3. Traer los elementos de "lista" "verde", "amarillo", "azul"


listadecolores

listadecolores.slice(3,6)
listadecolores.slice(3,7)
listadecolores.slice(3,5)
listadecolores.slice(3,6)


4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5

Array.range(0,1000,5)
res13: Array[Int] = Array(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300, 305, 310, 315, 320, 325, 330, 335, 340, 345, 350, 355, 360, 365, 370, 375, 380, 385, 390, 395, 400, 405, 410, 415, 420, 425, 430, 435, 440, 445, 450, 455, 460, 465, 470, 475, 480, 485, 490, 495, 500, 505, 510, 515, 520, 525, 530, 535, 540, 545, 550, 555, 560, 565, 570, 575, 580, 585, 590, 595, 600, 605, 610, 615, 620, 625, 630, 635, 640, 645, 650, 655, 660, 665, 670, 675, 680, 685, 690, 695, 700, 705, 710, 715, 720, 725, 730, 735, 740, 745, 750, 755, 760, 765, 770, 775, 780, 785, 790...




// 5. Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos


var y = List(1,3,3,4,6,7,3,7)
y: List[Int] = List(1, 3, 3, 4, 6, 7, 3, 7)

y
res0: List[Int] = List(1, 3, 3, 4, 6, 7, 3, 7)

y.distinct
res1: List[Int] = List(1, 3, 4, 6, 7)





// 6. Crea una mapa mutable llamado nombres que contenga los siguiente
"Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"


var nombres = scala.collection.mutable.Map[String, Int]()
nombres: scala.collection.mutable.Map[String,Int] = Map()


nombres +=("Jose" -> 20)
res3: scala.collection.mutable.Map[String,Int] = Map(Jose -> 20)

nombres +=("Luis" -> 24)
res4: scala.collection.mutable.Map[String,Int] = Map(Luis -> 24, Jose -> 20)

nombres +=("Luis" -> 24)
res5: scala.collection.mutable.Map[String,Int] = Map(Luis -> 24, Jose -> 20)

nombres +=("Ana" -> 23)
res6: scala.collection.mutable.Map[String,Int] = Map(Ana -> 23, Luis -> 24, Jose -> 20)

nombres +=("Susana" -> 27)
res7: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Luis -> 24, Jose -> 20)


// 6 a . Imprime todas la llaves del mapa


nombres
res8: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Luis -> 24, Jose -> 20)


// 7 b . Agrega el siguiente valor al mapa("Miguel", 23)

nombres
res4: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Luis -> 24, Jose -> 20)

nombres +=("Miguel" -> 23)
res5: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)

nombres
res6: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)


