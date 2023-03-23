package Figura

class Triangulo:Poligono(3) {

    var lado = 12.00
    var altura = 20.00

    override fun calucular_area():Double {
        return ((lado*altura)/2)
    }
    override fun calcuar_perimetro():Double{
        return lado+lado+lado
    }





}