package VehiculosRentin

import Autobus
import Camion
import Coche
import Furgoneta
import Vehiculo

class Alquiler {
    var pedido = mutableListOf<Vehiculo>()
    var nombreEmpresa="Empresa"

    constructor(numeroVehiculos:Int){
        for(i in (1..numeroVehiculos)){
            impirmemenu()
            var opcionTipo=readln().toInt()
            when(opcionTipo){
                //Coche(matricula:String, duracion: Int,plazas: Int):
                1-> {
                    print("introduce (matricula:String, duracion: Int,plazas: Int)")
                   var matricula = readln().toString()
                    var duracion =readln().toInt()
                    var plazas=readln().toInt()
                    var v1=Coche(matricula,duracion,plazas)
                    pedido.add(v1)

                    //pedido.add(Coche(readln().toString(), readln().toInt(), readln().toInt()))
                }
                2->{
                    print("introduce (matricula:String, duracion: Int,plazas: Int)")
                    pedido.add(Autobus(readln().toString(), readln().toInt(), readln().toInt()))
                }
                //(matricula:String, duracion: Int,tara: Int)
                3->{
                    print("introduce (matricula:String, duracion: Int,tara: Int)")
                    pedido.add(Camion(readln().toString(), readln().toInt(), readln().toInt()))
                }
                4->{
                    //(matricula:String, duracion: Int,tara: Int)
                    print("introduce (matricula:String, duracion: Int,tara: Int)")
                    pedido.add(Furgoneta(readln().toString(), readln().toInt(), readln().toInt()))
                }


            }


        }



    }
    fun imprimirRecibos(){
        for(v in pedido){
            v.recibo()
        }
    }

    fun calcularTotalAlquileres():Double{
        var total=0.0
        for(v in pedido){
            total+=v.alquiler()
        }
        return total
    }


}
fun impirmemenu(){
   println("1 coche")
    println("2 autobus")
    println("3 camión")
    println("4 furgoneta")
}