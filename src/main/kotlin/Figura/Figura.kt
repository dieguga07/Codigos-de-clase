package Figura

import Productos.Product

abstract class Figura:Print {


abstract fun calucular_area():Double

abstract fun calcuar_perimetro():Double


constructor():super(){}


}