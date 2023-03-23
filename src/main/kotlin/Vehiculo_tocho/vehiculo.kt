abstract class Vehiculo(matricula:String, duracion: Int) {


    open var matricula: String = ""
        get() = field
        set(value) {
            field = value
        }

    open var duracion: Int = 0
        get() = field
        set(value) { field = value
        }

    abstract fun alquiler (): Double

    abstract fun recibo ()




}


