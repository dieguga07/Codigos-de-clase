package Almacen

open class BebidaAzucarada(Identificador:Int, Litros:Double, Precio:Double, Marca:String,PorcentajeAzucar:Double,Promocion:Boolean):Bebida(Identificador,Litros,Precio,Marca){


    var porcentaje_azucar = PorcentajeAzucar
    var promocion = Promocion

    init {
        var porcentaje_azucar = PorcentajeAzucar
        var promocion = Promocion
    }


    override fun Calcular(cantidad:Int):Double{
    if(promocion)
        return super.Calcular(cantidad)*0.9
    else
        return super.Calcular(cantidad)
    }

    override fun toString(): String {
        return "BebidaAzucarada:$porcentaje_azucar,$promocion,$litros,$precio,$marca,$identificador"
    }


}