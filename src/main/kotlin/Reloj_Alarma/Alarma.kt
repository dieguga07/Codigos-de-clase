package Reloj_Alarma


/**
 * # Comentarios:
 * ## Comentario sobre la clase Alarma
 * Esta clase [Alarma] consiste es establecer una hora para una alarma se realiza con la ayuda
 * de las variables [hora_alarma] y [minuto_alarma] y las funciones [sumar_segundo] que
 * se hereda de [Reloj] y [alarma_hora] que es propia de la clase.
 *
 * ## Aclaracion
 *
 * La clase [Alarma] va complementada con la clase [Reloj] ambas trabajan juntas para establecer
 * una hora y una alarma que sonara cuando llegue su momento.
 *
 * **Fin de la aclaracion**
 *
 * ## Orden
 * 1. Reloj
 * 2. Alarma
 * 3. Main
 * ## Codigo del Main_Reloj
 * ```fun main() {

var reloj_1 = Reloj(23,59,59)
var alarma_1 = Alarma(18, 52)

println(reloj_1.decir_hora())

reloj_1.sumar_segundo()

println(reloj_1.decir_hora())

alarma_1.establecer_tiempo(18,35,23)

for( i in 0..1000){
alarma_1.sumar_segundo()
println(alarma_1.decir_hora())
}


}
```
 *
 * @author Diego Gutierrez
 * @since 1.0.1
 */
class Alarma(horaAlarma:Int, minutoAlarma:Int): Reloj() {

    var hora_alarma = horaAlarma
        get(){
            return field
        }
        set(value) {
            if (value !in 0..24) {
              println("La hora debe estar entre 0 y 23")
            }else field = value
        }

    var minuto_alarma = minutoAlarma
        get(){
            return field
        }
        set(value) {
            if (value !in 0..60) {
                println("Los minutos debe estar entre 0 y 59")
            }else field = value
        }


    override fun sumar_segundo() {
        super.sumar_segundo()

        if (horas == hora_alarma && minutos == minuto_alarma && segundos == 0){
            println("Reloj_Alarma.Alarma sonando")
        }
    }

    /**
     *
     */
    fun alarma_hora(){
        println("Diga la hora de la alarma")
        hora_alarma = readln().toInt()
        println("Diga los minutos de la alarma")
        minuto_alarma = readln().toInt()

    }

}