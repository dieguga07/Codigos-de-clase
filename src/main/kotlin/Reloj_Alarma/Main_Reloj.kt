package Reloj_Alarma

fun main() {

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






}