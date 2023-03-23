package Figura

class Rectangulo(lado: Double, altura: Double) : Poligono(4) {

    var lado = 12.00
    var altura = 10.00

    override fun calucular_area():Double {
        return lado * altura
    }

    override fun calcuar_perimetro():Double{
        return( (lado*2) + (altura*2) )
    }





}