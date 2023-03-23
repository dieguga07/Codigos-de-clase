class Autobus(matricula:String, duracion: Int,plazas: Int):VehiculoTransporte(14) {

    init {
        this.matricula = matricula
        this.duracion = duracion
        this.plazas = plazas

        this.recibo()
    }

    override fun recibo() {


        println(

            """
                
-------------------- 
       Autobús
--------------------
Info del recibo del autobús
"""
        )
        super.recibo()
    }


    override fun alquiler(): Double {

        return ((50.0 * duracion.toDouble())+(1.5 * (plazas.toDouble()+duracion.toDouble())))
    }

}