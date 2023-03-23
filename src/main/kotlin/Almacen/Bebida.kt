package Almacen

abstract class Bebida(Identificador:Int,Litros:Double,Precio:Double,Marca:String){

    var identificador = Identificador
    var litros = Litros
    var precio = Precio
    var marca = Marca

    init {
         identificador = Identificador
         litros = Litros
         precio = Precio
         marca = Marca
    }

    open fun Calcular(cant_producto:Int):Double{
        return cant_producto * precio
    }







}