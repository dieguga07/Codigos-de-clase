package Almacen

fun  main(args:Array<String>){

    //1 12.09 10.00 coca-cola 40 true
    // 2 2.00 3.00 Fontbella Montaña

            if (args[0] == "azucarada") {

                var ideRecibido = args[1].toInt()

                var litrosRecibidos = args[2].toDouble()

                var precioRecibido = args[3].toDouble()

                var marcaRecibida = args[4]

                var porcentajeAzucarRecibido = args[5].toDouble()

                var promocionRecibida = args[6].toBoolean()

                var bebidaAzucarada2 = BebidaAzucarada(ideRecibido,litrosRecibidos,precioRecibido,
                    marcaRecibida,porcentajeAzucarRecibido,promocionRecibida)
            }
            if (args[0] == "mineral") {
            var id_agua = args[1].toInt()

            var litros_agua = args[2].toDouble()

            var precio_agua = args[3].toDouble()

            var marca_agua = args[4]

            var manantial_agua = args[5]

            var agua1 = Aguamineral(id_agua,litros_agua,precio_agua,marca_agua,manantial_agua)
                println(agua1.toString())
        }


}