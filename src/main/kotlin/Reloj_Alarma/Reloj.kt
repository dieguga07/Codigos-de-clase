package Reloj_Alarma

open class Reloj(Hora:Int, Minuto:Int, Segundo:Int) {

    var horas = 0
        get(){
            return field
        }
        set(value) {
            if (value>23){
                horas = 0

            }
            else {field = value
            }
        }
    var minutos = 0
        get(){
            return field
        }
        set(value) {
            if (value>59){
                horas = horas+1
                minutos = 0
            }
            else {field = value
            }
        }

    var segundos = 0
        get(){
            return field
        }
        set(value) {
            if (value>59){
                minutos = minutos+1
                segundos = 0
            }
            else {field = value
            }
        }

    init {
    horas = Hora
    minutos = Minuto
    segundos = Segundo
}


open fun establecer_tiempo (Hora:Int,Minuto:Int,Segundo:Int){
    horas = Hora
    minutos = Minuto
    segundos = Segundo
}

open fun decir_hora():String{
   return "La hora es $horas:$minutos:$segundos"
}

open fun sumar_segundo(){
    segundos = segundos+1

}

constructor():this(0,0,0)


}