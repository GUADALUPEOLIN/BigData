//Desarrollar un algoritmo en scala que calcule el radio de un circulo 
def radio(Area:Double):Double={
 (math.sqrt(Area/3.1416))
}
radio(28.45)


// Desarrollar un algoritmo en scala que me diga si un numero es primo
def isPrime(num:Int):Boolean =
(num>1)&& !(2 to scala.math.sqrt(num).toInt).exists(x =>num %x ==0)

//Dada la variable bird = "tweet", utiliza interpolacion de string para imprimir "Estoy ecribiendo un tweet"
var brird = "tweet"
println(s"Estoy escribiendo un sbrird")

//Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la
 secuencia "Luke"

var mensaje= "hola Luke soy tu padre"

//¿Cual es la diferencia en value y una variable en scala?
mensaje.slice(5,9)

val num=1
num3=4
var num2=2
var num2=3

//Dada la tupla ((2,4,5),(1,2,3),(3.1416,23)) regresa el numero 3.1416 

val tupla=(2,4,5),(1,2,3),(3.1416,23))
tupla
println(tupla.3_.1)
println(tupla._3_.1)
println(tupla._3._1)
