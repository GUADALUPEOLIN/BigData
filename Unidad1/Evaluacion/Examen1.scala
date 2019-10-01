def breakingRecords(juegos:Array[Int]): List[Int] = { 

var maxi = juegos(0) 
var countMaxi = 0 
var mini = juegos(0) 
var countMini = 0 
for ( i <- juegos) { 
if ( i > maxi ){

maxi = i
countMaxi += 1 
}else if( i < mini) { 
mini = i 
countMini += 1
}
}
var MyList = List(countMaxi,countMini)
return MyList 
}
var totaljuegos = 9
var juegos = Array(10,5,20,20,4,5,2,25,1) 
var juegos2 = Array(3,4,21,36,10,28,35,5,24,42)

println(breakingRecords(juegos)) 
println(breakingRecords(juegos2))
