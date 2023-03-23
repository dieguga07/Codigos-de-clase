package Almacen

class Almacen(){

    // lista de estanteria posibles
    var estanteria1:MutableList<Bebida> = mutableListOf()
    var estanteria2:MutableList<Bebida> = mutableListOf()
    var estanteria3:MutableList<Bebida> = mutableListOf()
    var estanteria4:MutableList<Bebida> = mutableListOf()
    //mapa que contiene las estanterias anteriores y se le asigna valores
    var Estanterias = mutableMapOf<Int, MutableList<Bebida>>(1 to estanteria1, 2 to estanteria2, 3 to estanteria3, 4 to estanteria4)

    fun precio_total(){
        var total_estanterias = 0.0
        for (estante in Estanterias.values) {
            for (bebida in estante)
                total_estanterias += bebida.precio
        }

        println("El precio total es $total_estanterias")
    }

    fun precio_marca(marca:String){
        var cuenta_marcas = 0.0
        for (estante in Estanterias.values) {
            for (bebida in estante)
            if (bebida.marca == marca)
                cuenta_marcas += bebida.precio
        }
        println("El precio para las bebidas de la marca $marca es :$cuenta_marcas")
    }

    fun mostrar(){
        for (estante in Estanterias.values)
            for (bebida in estante)
                println("Datos:${bebida.marca},${bebida.litros},${bebida.precio}")
}

    fun precio_estanteria(numero_estanteria: Int){
        var precio_estanteria = 0.0
        for (bebida in Estanterias[numero_estanteria]!!){
            precio_estanteria += bebida.precio
        }
    }
        fun agregar_producto_1(producto: Bebida, numero_estanteria: Int) {
                Estanterias[numero_estanteria]?.add(producto)
        }

        fun agregar_producto_2(producto: Bebida) {
        var tamano = 9999
        var posicion = 0
            for ((estante,bebida)in Estanterias){
                if (bebida.size<tamano) {
                    tamano = bebida.size
                    posicion = estante
                }
            }
            Estanterias[posicion]?.add(producto)
        }


        fun eliminar_producto(id:Int) {
            for (estante in Estanterias.values) {
                for (bebida in estante)
                    if (bebida.identificador == id){
                        estante.remove(bebida)
                        break
                    }
            }
        }

}
