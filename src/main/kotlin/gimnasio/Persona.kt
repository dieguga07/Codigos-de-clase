package gimnasio

abstract class
Persona(Nombre:String,Edad:Int){

    var nombre = ""
    var edad = 16
        get() {
            return field
        }
        set(value) {
            if (value >= 16){
                field = value
            }
            else{
                println("Edad insuficiente")
            }
        }

    init {
        nombre = Nombre
        edad = Edad
    }

    abstract fun balanceMensual()










}