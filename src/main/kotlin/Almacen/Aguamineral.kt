package Almacen

open class Aguamineral(Identificador:Int, Litros:Double, Precio:Double, Marca:String, ManantialOrigen:String):Bebida(Identificador,Litros,Precio,Marca) {

    var manantial_origen = ManantialOrigen

    init {
        manantial_origen = ManantialOrigen
    }

    override fun toString(): String {
        return "Aguamineral(manantial_origen='$manantial_origen,$litros,$precio,$marca,$manantial_origen')"
    }


}