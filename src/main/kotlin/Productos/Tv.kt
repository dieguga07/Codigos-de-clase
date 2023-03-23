package Productos

open class Tv(regular_initial_price:Double,Manufacturer:String,Size:Int):Electronics(regular_initial_price,Manufacturer) {
    override fun computeSpecialCustomerPrice(): Double {
        var valor_especial = 0.0
        valor_especial = regular_price - 100
        return valor_especial
    }

    override fun computer_sale_price(): Double {
        var valor = 0.0
        valor = regular_price * 0.8
        return valor
    }


}