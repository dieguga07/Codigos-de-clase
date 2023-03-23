package Productos

open class Mp3Player (regular_initial_price:Double,Manufacturer:String,Color:String):Electronics(regular_initial_price,Manufacturer) {
    override fun computeSpecialCustomerPrice(): Double {
    var valor_especial = 0.0
        valor_especial = regular_price - 15
        return valor_especial
    }


    override fun computer_sale_price():Double{
        var valor = 0.0
        valor = regular_price * 0.9
        return valor
    }

    


}