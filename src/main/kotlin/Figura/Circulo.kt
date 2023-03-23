package Figura

import kotlin.math.PI

class Circulo( var radio:Double ):Figura(){


    override fun calucular_area():Double {
        return radio * radio * PI
    }

    override fun calcuar_perimetro():Double{

        return 2*radio* PI
    }

    override fun printable(){
        println(calucular_area())
        println(calcuar_perimetro())
    }




}