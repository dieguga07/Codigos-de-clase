package Productos

open class Camara(regular_initial_price:Double,Manufacturer:String):Electronics(regular_initial_price,Manufacturer) {
    override fun computeSpecialCustomerPrice(): Double {
        var valor_especial = 0.0
        valor_especial = regular_price - 205
        return valor_especial

    }

    override fun computer_sale_price(): Double {
        var valor = 0.0
        valor = regular_price * 0.7
        return valor
    }


}