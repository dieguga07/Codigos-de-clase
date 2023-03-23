package gimnasio

import Almacen.Bebida

open class Socio(Nombre:String, Edad:Int, NumeroSocio:Int):Persona(Nombre,Edad){

var numero_socio = 0

    init {
        numero_socio = NumeroSocio
    }

    override fun balanceMensual() {
        var total = 0
        if (edad>=18){
           total = 35
        }else{
            total = 20
        }

    }



    var ListaActividades = mutableMapOf(1 to "Karate", 2 to "spinning",3 to "otra")
    var lista_registro = mutableListOf<Int>(1,2,3)

    private fun actividadesPosibles(numero:Int){
        println("La actividad posible${ListaActividades[numero]}")
        lista_registro.add(numero)
    }

    fun anadirActividad(numero:Int,nombre:String){
        ListaActividades[numero] = nombre
    }


    open fun balanceMensual(actividades: Int) {}
}