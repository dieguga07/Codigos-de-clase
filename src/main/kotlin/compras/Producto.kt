package compras

open class Producto(Nombre:String,Precio:Double) {

    var nombre = ""
    var precio = 0.0

    init {
        nombre = Nombre
        precio = Precio
    }

    open fun calcular_precio(cantidad:Int){

        var total = 0.0
       total =  cantidad*precio
       println("El precio es: $total")

    }
















}
