package Cartas

class CartaGenerica(Palo:Int,Numero:Int){

    var mapa = mutableListOf<Int>(1,2,3,4)
    var palo = Palo

        get() {
            return field
        }
        set(value) {
            if (value in 0..4)
                field = value
        }

    var numero = Numero

        get() {
            return field
        }
        set(value) {
            if (value in 0..12)
                field = value
        }
    constructor():this(0,0)


















}