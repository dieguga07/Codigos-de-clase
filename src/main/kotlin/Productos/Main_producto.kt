package Productos

fun main(){

 var producto_1 = Tv(700.75,"Sony",52)
 var producto_2 = Tv(759.99,"Samsung",48)
 var producto_3 = Book(31.50,"Peter",2000)
 val producto_4 = Book(59.99,"Anna",2020)
 val producto_5 = Mp3Player(18.99,"Samsung","White")
 val producto_6 = Camara(411.99,"Sony")
 val producto_7 = Camara(524.90,"Samsung")

 var lista_productos= mutableListOf<Product>(producto_1, producto_2, producto_3 ,producto_4,producto_5,producto_6,producto_7)

 var acumulador = 0.00

  for (i in lista_productos) {

   println("El valor del producto es ${i.regular_price}")
   acumulador += i.regular_price


  }
  println("La suma total de todos sin descuento es:$acumulador")
  acumulador = 0.00


 println("---------------------------------------------------------------------------------------------------")
 println("                                      Precio Con Descuento                                         ")
 println("---------------------------------------------------------------------------------------------------")

 for (x in lista_productos){
  println("El valor del producto es ${x.computer_sale_price()}")
  acumulador += x.computer_sale_price()

 }
 println("La suma total de todos con descuento es:$acumulador")
 acumulador = 0.00


 println(Product.ver_contador())


 /*fun main(args:Array<String>){

  var lista_productos_recibidos=mutableListOf<Product>()

  for(posicion in args.indices){
   if(args[posicion] == "book")

  }*/
}