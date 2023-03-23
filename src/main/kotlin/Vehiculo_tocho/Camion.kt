class Camion(matricula:String, duracion: Int,tara: Int):VehiculoCarga(0) {

    init {
        this.matricula = matricula
        this.duracion = duracion
        this.tara = tara

        this.recibo()
    }

    override fun recibo() {


        println(

            """
                
-------------------- 
       CAMIÓN
--------------------
Info del recibo del camión
"""
        )
        super.recibo()
    }


    override fun alquiler(): Double {
        return ((50.0 * duracion.toDouble())+(20 * (tara.toDouble()))+40)
    }


}